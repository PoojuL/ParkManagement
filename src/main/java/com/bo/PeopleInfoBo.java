package com.bo;

public class PeopleInfoBo {

  private int id;
	private String fullName;
	private String email;
	private String dob;
	private String phone;
	private String things_to_do;
	private String idType;
	private String idNumber;
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
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the things_to_do
	 */
	public String getThings_to_do() {
		return things_to_do;
	}
	/**
	 * @param things_to_do the things_to_do to set
	 */
	public void setThings_to_do(String things_to_do) {
		this.things_to_do = things_to_do;
	}
	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}
	/**
	 * @param idType the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}
	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * @param idNumber the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public PeopleInfoBo(String fullName, String email, String dob, String phone, String things_to_do, String idType,
			String idNumber) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.things_to_do = things_to_do;
		this.idType = idType;
		this.idNumber = idNumber;
	}
	public PeopleInfoBo(int id, String fullName, String email, String dob, String phone, String things_to_do,
			String idType, String idNumber) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.things_to_do = things_to_do;
		this.idType = idType;
		this.idNumber = idNumber;
	}
	public PeopleInfoBo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
