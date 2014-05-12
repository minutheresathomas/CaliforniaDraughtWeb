package sjsu.cmpe272.entity;

public class AverageMonthOutflow {
	private long MonthAvgOutflow;
	
	private String date;

	public long getMonthAvgOutflow() {
		return MonthAvgOutflow;
	}

	public void setMonthAvgOutflow(long monthAvgOutflow) {
		MonthAvgOutflow = monthAvgOutflow;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
