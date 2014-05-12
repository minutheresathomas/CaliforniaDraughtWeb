package sjsu.cmpe272.entity;

import java.util.Date;

public class AverageMonthStorage {
	
	private String date;
	
	private long monthAvgStorage;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getMonthAvgStorage() {
		return monthAvgStorage;
	}
	public void setMonthAvgStorage(long monthAvgStorage) {
		this.monthAvgStorage = monthAvgStorage;
	}
	
}
