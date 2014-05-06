package sjsu.cmpe272.svc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import sjsu.cmpe272.entity.Forecast;
import sjsu.cmpe272.entity.Reservoir;

@Component
public class MongoSvcImpl implements MongoSvc {
	@Autowired
	MongoOperations mongoOps;

	@Override
	public void insert(List<Reservoir> documents) {
		mongoOps.insertAll(documents);
	}

	@Override
	public Reservoir findReservoirByName(String name) {

		Criteria criteria = new Criteria("name");
		criteria.in(name);
		Query query = new Query(criteria);
		Reservoir reservoir = mongoOps.findOne(query, Reservoir.class);
		return reservoir;
	}

	@Override
	public Reservoir findReservoirDoc(String id) {
		BasicQuery query1 = new BasicQuery("{\"stationId\":\"" + id + "\"}");
		return mongoOps.findOne(query1, Reservoir.class);
	}

	@Override
	public Forecast findForecastById(String reservoirId) {
		Forecast forecast = new Forecast();

		Reservoir reservoir = findReservoirDoc(reservoirId);
		Map<Long, Long> storageData = reservoir.getStorageData();
		Map<String, List<Long>> monthlyBucketMap = new LinkedHashMap<String, List<Long>>();
		// Map<String, Long> monthlyAverageMap = new LinkedHashMap<String,
		// Long>();

		for (Entry<Long, Long> entry : storageData.entrySet()) {
			entry.getValue();

			Date date = new Date(entry.getKey());
			SimpleDateFormat df2 = new SimpleDateFormat("MM/yyyy");
			String dateText = df2.format(date);

			List<Long> monthlyList = monthlyBucketMap.get(dateText);
			if (monthlyList == null) {
				monthlyList = new ArrayList<Long>();
			}
			monthlyList.add(entry.getValue());
			monthlyBucketMap.put(dateText, monthlyList);

		}

		Map<String, Long> monthlyAverageMap = new LinkedHashMap<String, Long>();
		for (Entry<String, List<Long>> e : monthlyBucketMap.entrySet()) {
			Long avg = sum(e.getValue()) / e.getValue().size();
			monthlyAverageMap.put(e.getKey(), avg);
		}

		Map<String, ArrayList<Long>> forecastData = new LinkedHashMap<String, ArrayList<Long>>();
		Map<String, ArrayList<Long>> forecastDataMonth = new LinkedHashMap<String, ArrayList<Long>>();

		String latestYear = null;

		for (Entry<String, Long> e : monthlyAverageMap.entrySet()) {
			String year = e.getKey().split("/")[1];
			String month = e.getKey().split("/")[0];
			latestYear = year;
			ArrayList<Long> dataPointsForThisYear = forecastData.get(year);
			ArrayList<Long> dataPointsForAllMonths = forecastDataMonth
					.get(month);

			if (dataPointsForThisYear == null) {
				dataPointsForThisYear = new ArrayList<Long>();
			}
			dataPointsForThisYear.add(e.getValue());
			forecastData.put(year, dataPointsForThisYear);

			if (dataPointsForAllMonths == null) {
				dataPointsForAllMonths = new ArrayList<Long>();
			}
			dataPointsForAllMonths.add(e.getValue());
			forecastDataMonth.put(month, dataPointsForAllMonths);

			forecast.setForcastData(forecastData);
			forecast.setForecastDataMonth(forecastDataMonth);

		}

		int nextYear = Integer.parseInt(latestYear) + 1;
		forecastData.put("" + nextYear, average(forecastDataMonth));

		return forecast;
	}

	private Long sum(List<Long> value) {
		long sum = 0;
		for (Long l : value) {
			sum += l;
		}
		return sum;
	}

	private ArrayList<Long> average(
			Map<String, ArrayList<Long>> forecastDataMonth) {
		ArrayList<Long> projectedYearValues = new ArrayList<Long>();
		for (Entry<String, ArrayList<Long>> e : forecastDataMonth.entrySet()) {
			ArrayList<Long> yoyArrayForAMonth = e.getValue();
			Long lastValue = -99L;
			ArrayList<Long> diffArray = new ArrayList<Long>();
			for (Long valueOfAMonth : yoyArrayForAMonth) {
				if (lastValue != -99) {
					Long diff = valueOfAMonth - lastValue;
					diffArray.add(diff);
				}
				lastValue = valueOfAMonth;
			}
			Long projection = (lastValue) - sum(diffArray) / diffArray.size();
			projectedYearValues.add(projection);
		}

		return projectedYearValues;
	}
}
