package sjsu.cmpe272.entity;

public class MonthlyReportInflow {
	private String _id;
	private int reservoir_count;
	private long total_capacityInflow;
	private double averageInflow;
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
	public long getTotal_capacityInflow() {
		return total_capacityInflow;
	}
	public void setTotal_capacityInflow(long total_capacityInflow) {
		this.total_capacityInflow = total_capacityInflow;
	}
	public double getAverageInflow() {
		return averageInflow;
	}
	public void setAverageInflow(double averageInflow) {
		this.averageInflow = averageInflow;
	}
	
}
