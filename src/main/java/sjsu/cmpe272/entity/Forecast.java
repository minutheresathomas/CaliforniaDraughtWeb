package sjsu.cmpe272.entity;

import java.util.ArrayList;
import java.util.Map;

public class Forecast {

	private Map<String, ArrayList<Long>> forcastData;

	private Map<String, ArrayList<Long>> forecastDataMonth;

	public Map<String, ArrayList<Long>> getForcastData() {
		return forcastData;
	}

	public void setForcastData(Map<String, ArrayList<Long>> forcastData) {
		this.forcastData = forcastData;
	}

	public Map<String, ArrayList<Long>> getForecastDataMonth() {
		return forecastDataMonth;
	}

	public void setForecastDataMonth(
			Map<String, ArrayList<Long>> forecastDataMonth) {
		this.forecastDataMonth = forecastDataMonth;
	}

}
