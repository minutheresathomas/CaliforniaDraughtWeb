package sjsu.cmpe272.entity;

public class AverageMonthInflow {
	private long MonthAvgInflow;
	
	private String date;

	public long getMonthAvgInflow() {
		return MonthAvgInflow;
	}

	public void setMonthAvgInflow(long monthAvgInflow) {
		MonthAvgInflow = monthAvgInflow;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
