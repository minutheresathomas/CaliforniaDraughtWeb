package sjsu.cmpe272.entity;

public class YearlyReportOutflow {
	private String _id;
	private int reservoir_count;
	private long total_capacityOutflow;
	private double averageOutflow;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public int getReservoir_count() {
		return reservoir_count;
	}
	public void setReservoir_count(int reservoir_count) {
		this.reservoir_count = reservoir_count;
	}
	public long getTotal_capacityOutflow() {
		return total_capacityOutflow;
	}
	public void setTotal_capacityOutflow(long total_capacityOutflow) {
		this.total_capacityOutflow = total_capacityOutflow;
	}
	public double getAverageOutflow() {
		return averageOutflow;
	}
	public void setAverageOutflow(double averageOutflow) {
		this.averageOutflow = averageOutflow;
	}
	
}
