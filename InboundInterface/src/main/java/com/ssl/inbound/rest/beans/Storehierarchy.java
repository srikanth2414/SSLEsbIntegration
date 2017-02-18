package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Storehierarchy {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("STOREID")
	private String sTOREID;
	@JsonProperty("StoreCode")
	private String storeCode;
	@JsonProperty("StoreName")
	private String storeName;
	@JsonProperty("AddLine1")
	private String addLine1;
	@JsonProperty("AddLine2")
	private String addLine2;
	@JsonProperty("AddLine3")
	private String addLine3;
	@JsonProperty("StorePhoneNo")
	private String storePhoneNo;
	@JsonProperty("ManagersName")
	private String managersName;
	@JsonProperty("StoreChain")
	private String storeChain;
	@JsonProperty("StoreChainName")
	private String storeChainName;
	@JsonProperty("Region")
	private String region;
	@JsonProperty("RegionName")
	private String regionName;
	@JsonProperty("District")
	private String district;
	@JsonProperty("DistrictName")
	private String districtName;
	@JsonProperty("AirportStore")
	private String airportStore;
	@JsonProperty("StoreVATNum")
	private String storeVATNum;
	@JsonProperty("StoreTINNum")
	private String storeTINNum;
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

	@JsonProperty("StoreCode")
	public String getStoreCode() {
		return storeCode;
	}

	@JsonProperty("StoreCode")
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	@JsonProperty("StoreName")
	public String getStoreName() {
		return storeName;
	}

	@JsonProperty("StoreName")
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@JsonProperty("AddLine1")
	public String getAddLine1() {
		return addLine1;
	}

	@JsonProperty("AddLine1")
	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	@JsonProperty("AddLine2")
	public String getAddLine2() {
		return addLine2;
	}

	@JsonProperty("AddLine2")
	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	@JsonProperty("AddLine3")
	public String getAddLine3() {
		return addLine3;
	}

	@JsonProperty("AddLine3")
	public void setAddLine3(String addLine3) {
		this.addLine3 = addLine3;
	}

	@JsonProperty("StorePhoneNo")
	public String getStorePhoneNo() {
		return storePhoneNo;
	}

	@JsonProperty("StorePhoneNo")
	public void setStorePhoneNo(String storePhoneNo) {
		this.storePhoneNo = storePhoneNo;
	}

	@JsonProperty("ManagersName")
	public String getManagersName() {
		return managersName;
	}

	@JsonProperty("ManagersName")
	public void setManagersName(String managersName) {
		this.managersName = managersName;
	}

	@JsonProperty("StoreChain")
	public String getStoreChain() {
		return storeChain;
	}

	@JsonProperty("StoreChain")
	public void setStoreChain(String storeChain) {
		this.storeChain = storeChain;
	}

	@JsonProperty("StoreChainName")
	public String getStoreChainName() {
		return storeChainName;
	}

	@JsonProperty("StoreChainName")
	public void setStoreChainName(String storeChainName) {
		this.storeChainName = storeChainName;
	}

	@JsonProperty("Region")
	public String getRegion() {
		return region;
	}

	@JsonProperty("Region")
	public void setRegion(String region) {
		this.region = region;
	}

	@JsonProperty("RegionName")
	public String getRegionName() {
		return regionName;
	}

	@JsonProperty("RegionName")
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@JsonProperty("District")
	public String getDistrict() {
		return district;
	}

	@JsonProperty("District")
	public void setDistrict(String district) {
		this.district = district;
	}

	@JsonProperty("DistrictName")
	public String getDistrictName() {
		return districtName;
	}

	@JsonProperty("DistrictName")
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	@JsonProperty("AirportStore")
	public String getAirportStore() {
		return airportStore;
	}

	@JsonProperty("AirportStore")
	public void setAirportStore(String airportStore) {
		this.airportStore = airportStore;
	}

	@JsonProperty("StoreVATNum")
	public String getStoreVATNum() {
		return storeVATNum;
	}

	@JsonProperty("StoreVATNum")
	public void setStoreVATNum(String storeVATNum) {
		this.storeVATNum = storeVATNum;
	}

	@JsonProperty("StoreTINNum")
	public String getStoreTINNum() {
		return storeTINNum;
	}

	@JsonProperty("StoreTINNum")
	public void setStoreTINNum(String storeTINNum) {
		this.storeTINNum = storeTINNum;
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