package sjsu.cmpe272.entity;

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
	private Map<Long, Long> storageData;
	private Map<Long,Long> outflowData;
	private Map<Long,Long> inflowData;
	
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

	public Map<Long, Long> getStorageData() {
		return storageData;
	}

	public void setStorageData(Map<Long, Long> storageData) {
		this.storageData = storageData;
	}

	public Map<Long,Long> getOutflowData(String stationName) {
		return outflowData;
	}

	public void setOutflowData(Map<Long,Long> outflowData) {
		this.outflowData = outflowData;
	}

	public Map<Long,Long> getInflowData(String stationName) {
		return inflowData;
	}

	public void setInflowData(Map<Long,Long> inflowData) {
		this.inflowData = inflowData;
	}
}
