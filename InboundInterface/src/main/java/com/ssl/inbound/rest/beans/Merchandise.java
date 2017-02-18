package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Merchandise {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("STOREID")
	private String sTOREID;
	@JsonProperty("Department")
	private String department;
	@JsonProperty("Sub-Dept")
	private String subDept;
	@JsonProperty("Class")
	private String _class;
	@JsonProperty("Sub-Class")
	private String subClass;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("EmployeeDiscountPercentage")
	private String employeeDiscountPercentage;
	@JsonProperty("BusinessFormat")
	private String businessFormat;
	@JsonProperty("CreateDate")
	private String createDate;
	@JsonProperty("REF1")
	private String rEF1;
	@JsonProperty("REF2")
	private String rEF2;
	@JsonProperty("REF3")
	private String rEF3;

	@JsonProperty("CorelationID")
	public String getCorelationID() {
		return corelationID;
	}

	@JsonProperty("CorelationID")
	public void setCorelationID(String corelationID) {
		this.corelationID = corelationID;
	}

	@JsonProperty("STOREID")
	public String getSTOREID() {
		return sTOREID;
	}

	@JsonProperty("STOREID")
	public void setSTOREID(String sTOREID) {
		this.sTOREID = sTOREID;
	}

	@JsonProperty("Department")
	public String getDepartment() {
		return department;
	}

	@JsonProperty("Department")
	public void setDepartment(String department) {
		this.department = department;
	}

	@JsonProperty("Sub-Dept")
	public String getSubDept() {
		return subDept;
	}

	@JsonProperty("Sub-Dept")
	public void setSubDept(String subDept) {
		this.subDept = subDept;
	}

	@JsonProperty("Class")
	public String getClass_() {
		return _class;
	}

	@JsonProperty("Class")
	public void setClass_(String _class) {
		this._class = _class;
	}

	@JsonProperty("Sub-Class")
	public String getSubClass() {
		return subClass;
	}

	@JsonProperty("Sub-Class")
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("EmployeeDiscountPercentage")
	public String getEmployeeDiscountPercentage() {
		return employeeDiscountPercentage;
	}

	@JsonProperty("EmployeeDiscountPercentage")
	public void setEmployeeDiscountPercentage(String employeeDiscountPercentage) {
		this.employeeDiscountPercentage = employeeDiscountPercentage;
	}

	@JsonProperty("BusinessFormat")
	public String getBusinessFormat() {
		return businessFormat;
	}

	@JsonProperty("BusinessFormat")
	public void setBusinessFormat(String businessFormat) {
		this.businessFormat = businessFormat;
	}

	@JsonProperty("CreateDate")
	public String getCreateDate() {
		return createDate;
	}

	@JsonProperty("CreateDate")
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@JsonProperty("REF1")
	public String getREF1() {
		return rEF1;
	}

	@JsonProperty("REF1")
	public void setREF1(String rEF1) {
		this.rEF1 = rEF1;
	}

	@JsonProperty("REF2")
	public String getREF2() {
		return rEF2;
	}

	@JsonProperty("REF2")
	public void setREF2(String rEF2) {
		this.rEF2 = rEF2;
	}

	@JsonProperty("REF3")
	public String getREF3() {
		return rEF3;
	}

	@JsonProperty("REF3")
	public void setREF3(String rEF3) {
		this.rEF3 = rEF3;
	}

}