package sjsu.cmpe272.entity;

public class YearlyStorageReport {
	private String _id;
	private int reservoir_count;
	private long total_capacity;
	private double averagecapacity;
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
	public long getTotal_capacity() {
		return total_capacity;
	}
	public void setTotal_capacity(long total_capacity) {
		this.total_capacity = total_capacity;
	}
	public double getAveragecapacity() {
		return averagecapacity;
	}
	public void setAveragecapacity(double averagecapacity) {
		this.averagecapacity = averagecapacity;
	}
	
	
}
