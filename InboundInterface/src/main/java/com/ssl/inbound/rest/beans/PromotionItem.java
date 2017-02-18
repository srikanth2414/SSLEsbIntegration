package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PromotionItem {

	@JsonProperty("SKUEventStore")
	private String sKUEventStore;
	@JsonProperty("SKUEventNumber")
	private String sKUEventNumber;
	@JsonProperty("SKUNumber")
	private String sKUNumber;
	@JsonProperty("SKUPrecedenceLevel")
	private String sKUPrecedenceLevel;
	@JsonProperty("SKUEventStartDate")
	private String sKUEventStartDate;
	@JsonProperty("SKUEventEndDate")
	private String sKUEventEndDate;
	@JsonProperty("SKUNewPrice")
	private String sKUNewPrice;
	@JsonProperty("PromoFlag")
	private String promoFlag;
	@JsonProperty("SKUEventType")
	private String sKUEventType;
	@JsonProperty("SKUEventPrecedenceVlaue")
	private String sKUEventPrecedenceVlaue;
	@JsonProperty("SKUEventBizFormat")
	private String sKUEventBizFormat;
	@JsonProperty("CreateDate")
	private String createDate;

	@JsonProperty("SKUEventStore")
	public String getSKUEventStore() {
		return sKUEventStore;
	}

	@JsonProperty("SKUEventStore")
	public void setSKUEventStore(String sKUEventStore) {
		this.sKUEventStore = sKUEventStore;
	}

	@JsonProperty("SKUEventNumber")
	public String getSKUEventNumber() {
		return sKUEventNumber;
	}

	@JsonProperty("SKUEventNumber")
	public void setSKUEventNumber(String sKUEventNumber) {
		this.sKUEventNumber = sKUEventNumber;
	}

	@JsonProperty("SKUNumber")
	public String getSKUNumber() {
		return sKUNumber;
	}

	@JsonProperty("SKUNumber")
	public void setSKUNumber(String sKUNumber) {
		this.sKUNumber = sKUNumber;
	}

	@JsonProperty("SKUPrecedenceLevel")
	public String getSKUPrecedenceLevel() {
		return sKUPrecedenceLevel;
	}

	@JsonProperty("SKUPrecedenceLevel")
	public void setSKUPrecedenceLevel(String sKUPrecedenceLevel) {
		this.sKUPrecedenceLevel = sKUPrecedenceLevel;
	}

	@JsonProperty("SKUEventStartDate")
	public String getSKUEventStartDate() {
		return sKUEventStartDate;
	}

	@JsonProperty("SKUEventStartDate")
	public void setSKUEventStartDate(String sKUEventStartDate) {
		this.sKUEventStartDate = sKUEventStartDate;
	}

	@JsonProperty("SKUEventEndDate")
	public String getSKUEventEndDate() {
		return sKUEventEndDate;
	}

	@JsonProperty("SKUEventEndDate")
	public void setSKUEventEndDate(String sKUEventEndDate) {
		this.sKUEventEndDate = sKUEventEndDate;
	}

	@JsonProperty("SKUNewPrice")
	public String getSKUNewPrice() {
		return sKUNewPrice;
	}

	@JsonProperty("SKUNewPrice")
	public void setSKUNewPrice(String sKUNewPrice) {
		this.sKUNewPrice = sKUNewPrice;
	}

	@JsonProperty("PromoFlag")
	public String getPromoFlag() {
		return promoFlag;
	}

	@JsonProperty("PromoFlag")
	public void setPromoFlag(String promoFlag) {
		this.promoFlag = promoFlag;
	}

	@JsonProperty("SKUEventType")
	public String getSKUEventType() {
		return sKUEventType;
	}

	@JsonProperty("SKUEventType")
	public void setSKUEventType(String sKUEventType) {
		this.sKUEventType = sKUEventType;
	}

	@JsonProperty("SKUEventPrecedenceVlaue")
	public String getSKUEventPrecedenceVlaue() {
		return sKUEventPrecedenceVlaue;
	}

	@JsonProperty("SKUEventPrecedenceVlaue")
	public void setSKUEventPrecedenceVlaue(String sKUEventPrecedenceVlaue) {
		this.sKUEventPrecedenceVlaue = sKUEventPrecedenceVlaue;
	}

	@JsonProperty("SKUEventBizFormat")
	public String getSKUEventBizFormat() {
		return sKUEventBizFormat;
	}

	@JsonProperty("SKUEventBizFormat")
	public void setSKUEventBizFormat(String sKUEventBizFormat) {
		this.sKUEventBizFormat = sKUEventBizFormat;
	}

	@JsonProperty("CreateDate")
	public String getCreateDate() {
		return createDate;
	}

	@JsonProperty("CreateDate")
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

}