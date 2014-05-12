package sjsu.cmpe272.entity;

public class RegressionForecast {
	private String _id;
	private double averagecapacity;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public double getAveragecapacity() {
		return averagecapacity;
	}
	public void setAveragecapacity(double averagecapacity) {
		this.averagecapacity = averagecapacity;
	}
}
