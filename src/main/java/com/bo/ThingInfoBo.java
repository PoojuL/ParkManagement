package com.bo;

public class ThingInfoBo {
	private int id;
	private String thingName;
	private String companyName;
	private String thingId;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the thingName
	 */
	public String getThingName() {
		return thingName;
	}
	/**
	 * @param thingName the thingName to set
	 */
	public void setThingName(String thingName) {
		this.thingName = thingName;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * @return the thingId
	 */
	public String getThingId() {
		return thingId;
	}
	/**
	 * @param thingId the thingId to set
	 */
	public void setThingId(String thingId) {
		this.thingId = thingId;
	}
	public ThingInfoBo(int id, String thingName, String companyName, String thingId) {
		super();
		this.id = id;
		this.thingName = thingName;
		this.companyName = companyName;
		this.thingId = thingId;
	}
	
	public ThingInfoBo(String thingName, String companyName, String thingId) {
		super();
		this.thingName = thingName;
		this.companyName = companyName;
		this.thingId = thingId;
	}
	public ThingInfoBo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
