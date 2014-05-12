package sjsu.cmpe272.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Reservoir {
	private String stationId;
	private String stationName;
	private String county;
	private String dataCollection;
	private String operator;
	private String longitude;
	private String latitude;
	private String nearbyCity;
	private String hydrologicArea;
	private Object riverBasin;
	private String elevation;
	private Map<String, Long> storageData;
	private Map<String,Long> outflowData;
	private Map<String,Long> inflowData;
	List<AverageMonthStorage> avgMonthStore = new ArrayList<AverageMonthStorage>();
	List<AverageYearStorage> avgYearStore = new ArrayList<AverageYearStorage>();
	List<AverageMonthInflow> avgMonthInflow = new ArrayList<AverageMonthInflow>();
	List<AverageYearInflow> avgYearInflow = new ArrayList<AverageYearInflow>();
	List<AverageMonthOutflow> avgMonthOutflow = new ArrayList<AverageMonthOutflow>();
	List<AverageYearOutflow> avgYearOutflow = new ArrayList<AverageYearOutflow>();
	
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	
	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getDataCollection() {
		return dataCollection;
	}

	public void setDataCollection(String dataCollection) {
		this.dataCollection = dataCollection;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getNearbyCity() {
		return nearbyCity;
	}

	public void setNearbyCity(String nearbyCity) {
		this.nearbyCity = nearbyCity;
	}

	public String getHydrologicArea() {
		return hydrologicArea;
	}

	public void setHydrologicArea(String hydrologicArea) {
		this.hydrologicArea = hydrologicArea;
	}

	public Object getRiverBasin() {
		return riverBasin;
	}

	public void setRiverBasin(Object riverBasin) {
		this.riverBasin = riverBasin;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Map<String, Long> getStorageData() {
		return storageData;
	}

	public void setStorageData(Map<String, Long> storageData) {
		this.storageData = storageData;
	}

	public Map<String,Long> getOutflowData(String stationName) {
		return outflowData;
	}

	public void setOutflowData(Map<String,Long> outflowData) {
		this.outflowData = outflowData;
	}

	public Map<String,Long> getInflowData(String stationName) {
		return inflowData;
	}

	public void setInflowData(Map<String,Long> inflowData) {
		this.inflowData = inflowData;
	}

	public List<AverageMonthStorage> getAvgMonthStore() {
		return avgMonthStore;
	}

	public void setAvgMonthStore(List<AverageMonthStorage> avgMonthStore) {
		this.avgMonthStore = avgMonthStore;
	}

	public List<AverageYearStorage> getAvgYearStore() {
		return avgYearStore;
	}

	public void setAvgYearStore(List<AverageYearStorage> avgYearStore) {
		this.avgYearStore = avgYearStore;
	}

	public List<AverageMonthInflow> getAvgMonthInflow() {
		return avgMonthInflow;
	}

	public void setAvgMonthInflow(List<AverageMonthInflow> avgMonthInflow) {
		this.avgMonthInflow = avgMonthInflow;
	}

	public List<AverageYearInflow> getAvgYearInflow() {
		return avgYearInflow;
	}

	public void setAvgYearInflow(List<AverageYearInflow> avgYearInflow) {
		this.avgYearInflow = avgYearInflow;
	}

	public List<AverageMonthOutflow> getAvgMonthOutflow() {
		return avgMonthOutflow;
	}

	public void setAvgMonthOutflow(List<AverageMonthOutflow> avgMonthOutflow) {
		this.avgMonthOutflow = avgMonthOutflow;
	}

	public List<AverageYearOutflow> getAvgYearOutflow() {
		return avgYearOutflow;
	}

	public void setAvgYearOutflow(List<AverageYearOutflow> avgYearOutflow) {
		this.avgYearOutflow = avgYearOutflow;
	}
	
}
