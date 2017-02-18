package com.ssl.inbound.rest.beans;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class PromotionHead {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("StoreCode")
	private String storeCode;
	@JsonProperty("EventNumber")
	private String eventNumber;
	@JsonProperty("EventDescription")
	private String eventDescription;
	@JsonProperty("EventFromDate")
	private String eventFromDate;
	@JsonProperty("EventToDate")
	private String eventToDate;
	@JsonProperty("EventType")
	private String eventType;
	@JsonProperty("EventPrecedenceVlaue")
	private String eventPrecedenceVlaue;
	@JsonProperty("EventBizFormat")
	private String eventBizFormat;
	@JsonProperty("CreateDate")
	private String createDate;
	@JsonProperty("REF1")
	private String rEF1;
	@JsonProperty("REF2")
	private String rEF2;
	@JsonProperty("REF3")
	private String rEF3;
	@JsonProperty("PromotionItems")
	private List<PromotionItem> promotionItems = null;

	@JsonProperty("CorelationID")
	public String getCorelationID() {
		return corelationID;
	}

	@JsonProperty("CorelationID")
	public void setCorelationID(String corelationID) {
		this.corelationID = corelationID;
	}

	@JsonProperty("StoreCode")
	public String getStoreCode() {
		return storeCode;
	}

	@JsonProperty("StoreCode")
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	@JsonProperty("EventNumber")
	public String getEventNumber() {
		return eventNumber;
	}

	@JsonProperty("EventNumber")
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}

	@JsonProperty("EventDescription")
	public String getEventDescription() {
		return eventDescription;
	}

	@JsonProperty("EventDescription")
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	@JsonProperty("EventFromDate")
	public String getEventFromDate() {
		return eventFromDate;
	}

	@JsonProperty("EventFromDate")
	public void setEventFromDate(String eventFromDate) {
		this.eventFromDate = eventFromDate;
	}

	@JsonProperty("EventToDate")
	public String getEventToDate() {
		return eventToDate;
	}

	@JsonProperty("EventToDate")
	public void setEventToDate(String eventToDate) {
		this.eventToDate = eventToDate;
	}

	@JsonProperty("EventType")
	public String getEventType() {
		return eventType;
	}

	@JsonProperty("EventType")
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@JsonProperty("EventPrecedenceVlaue")
	public String getEventPrecedenceVlaue() {
		return eventPrecedenceVlaue;
	}

	@JsonProperty("EventPrecedenceVlaue")
	public void setEventPrecedenceVlaue(String eventPrecedenceVlaue) {
		this.eventPrecedenceVlaue = eventPrecedenceVlaue;
	}

	@JsonProperty("EventBizFormat")
	public String getEventBizFormat() {
		return eventBizFormat;
	}

	@JsonProperty("EventBizFormat")
	public void setEventBizFormat(String eventBizFormat) {
		this.eventBizFormat = eventBizFormat;
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

	@JsonProperty("PromotionItems")
	public List<PromotionItem> getPromotionItems() {
		return promotionItems;
	}

	@JsonProperty("PromotionItems")
	public void setPromotionItems(List<PromotionItem> promotionItems) {
		this.promotionItems = promotionItems;
	}

}