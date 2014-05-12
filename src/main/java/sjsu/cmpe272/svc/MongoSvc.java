package sjsu.cmpe272.svc;

import java.util.List;

import sjsu.cmpe272.entity.Forecast;
import sjsu.cmpe272.entity.MonthlyReport;
import sjsu.cmpe272.entity.MonthlyReportInflow;
import sjsu.cmpe272.entity.MonthlyReportOutflow;
import sjsu.cmpe272.entity.RegressionForecast;
import sjsu.cmpe272.entity.Reservoir;
import sjsu.cmpe272.entity.YearlyInflowReport;
import sjsu.cmpe272.entity.YearlyReportOutflow;
import sjsu.cmpe272.entity.YearlyStorageReport;

public interface MongoSvc {

	public void insert(List<Reservoir> documents);

	public Reservoir findReservoirByName(String name);

	public Reservoir findReservoirDoc(String id);

	public Forecast findForecastById(String reservoirId);
	
	public List<Reservoir> getReservoirStorageInfo();
	
	public List<MonthlyReport> getMonthly();
	
	public List<RegressionForecast> linearRegression();
	
	public List<MonthlyReportInflow> getMonthlyInflow();
	
	public List<MonthlyReportOutflow> getMonthlyOutflow();
	
	public List<YearlyStorageReport> getyearlyStorage();
	
	public List<YearlyInflowReport> getyearlyInflow();
	
	public List<YearlyReportOutflow> getyearlyOutflow();

}
