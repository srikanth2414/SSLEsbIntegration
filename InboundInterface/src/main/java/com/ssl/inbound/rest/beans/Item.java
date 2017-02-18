package com.ssl.inbound.rest.beans;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Item {

	@JsonProperty("CorelationID")
	private String corelationID;
	@JsonProperty("STOREID")
	private String sTOREID;
	@JsonProperty("SKUNumber")
	private String sKUNumber;
	@JsonProperty("ItemDescription")
	private String itemDescription;
	@JsonProperty("StyleVendorNumber")
	private String styleVendorNumber;
	@JsonProperty("ColorCode")
	private String colorCode;
	@JsonProperty("SizeCode")
	private String sizeCode;
	@JsonProperty("SetCode")
	private String setCode;
	@JsonProperty("SubstituteSKU")
	private String substituteSKU;
	@JsonProperty("PricePrompt")
	private String pricePrompt;
	@JsonProperty("Department")
	private String department;
	@JsonProperty("SubDepartment")
	private String subDepartment;
	@JsonProperty("Class")
	private String _class;
	@JsonProperty("SubClass")
	private String subClass;
	@JsonProperty("SKUType")
	private String sKUType;
	@JsonProperty("PrimaryVendor")
	private String primaryVendor;
	@JsonProperty("SellingUM")
	private String sellingUM;
	@JsonProperty("RegisterItemDescription")
	private String registerItemDescription;
	@JsonProperty("DiscountFlag")
	private String discountFlag;
	@JsonProperty("POSComment")
	private String pOSComment;
	@JsonProperty("SeasonCode")
	private String seasonCode;
	@JsonProperty("SerialisedItemFlag")
	private String serialisedItemFlag;
	@JsonProperty("BrandCode")
	private String brandCode;
	@JsonProperty("MMRPFlag")
	private String mMRPFlag;
	@JsonProperty("EmplDiscFlag")
	private String emplDiscFlag;
	@JsonProperty("PriceModflag")
	private String priceModflag;
	@JsonProperty("PlaceholderItmMsg")
	private String placeholderItmMsg;
	@JsonProperty("CoreSku")
	private String coreSku;
	@JsonProperty("LoyaltyPromoAllowedFlag")
	private String loyaltyPromoAllowedFlag;
	@JsonProperty("TRNItemMsg")
	private String tRNItemMsg;
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

	@JsonProperty("SKUNumber")
	public String getSKUNumber() {
		return sKUNumber;
	}

	@JsonProperty("SKUNumber")
	public void setSKUNumber(String sKUNumber) {
		this.sKUNumber = sKUNumber;
	}

	@JsonProperty("ItemDescription")
	public String getItemDescription() {
		return itemDescription;
	}

	@JsonProperty("ItemDescription")
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@JsonProperty("StyleVendorNumber")
	public String getStyleVendorNumber() {
		return styleVendorNumber;
	}

	@JsonProperty("StyleVendorNumber")
	public void setStyleVendorNumber(String styleVendorNumber) {
		this.styleVendorNumber = styleVendorNumber;
	}

	@JsonProperty("ColorCode")
	public String getColorCode() {
		return colorCode;
	}

	@JsonProperty("ColorCode")
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	@JsonProperty("SizeCode")
	public String getSizeCode() {
		return sizeCode;
	}

	@JsonProperty("SizeCode")
	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
	}

	@JsonProperty("SetCode")
	public String getSetCode() {
		return setCode;
	}

	@JsonProperty("SetCode")
	public void setSetCode(String setCode) {
		this.setCode = setCode;
	}

	@JsonProperty("SubstituteSKU")
	public String getSubstituteSKU() {
		return substituteSKU;
	}

	@JsonProperty("SubstituteSKU")
	public void setSubstituteSKU(String substituteSKU) {
		this.substituteSKU = substituteSKU;
	}

	@JsonProperty("PricePrompt")
	public String getPricePrompt() {
		return pricePrompt;
	}

	@JsonProperty("PricePrompt")
	public void setPricePrompt(String pricePrompt) {
		this.pricePrompt = pricePrompt;
	}

	@JsonProperty("Department")
	public String getDepartment() {
		return department;
	}

	@JsonProperty("Department")
	public void setDepartment(String department) {
		this.department = department;
	}

	@JsonProperty("SubDepartment")
	public String getSubDepartment() {
		return subDepartment;
	}

	@JsonProperty("SubDepartment")
	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}

	@JsonProperty("Class")
	public String getClass_() {
		return _class;
	}

	@JsonProperty("Class")
	public void setClass_(String _class) {
		this._class = _class;
	}

	@JsonProperty("SubClass")
	public String getSubClass() {
		return subClass;
	}

	@JsonProperty("SubClass")
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	@JsonProperty("SKUType")
	public String getSKUType() {
		return sKUType;
	}

	@JsonProperty("SKUType")
	public void setSKUType(String sKUType) {
		this.sKUType = sKUType;
	}

	@JsonProperty("PrimaryVendor")
	public String getPrimaryVendor() {
		return primaryVendor;
	}

	@JsonProperty("PrimaryVendor")
	public void setPrimaryVendor(String primaryVendor) {
		this.primaryVendor = primaryVendor;
	}

	@JsonProperty("SellingUM")
	public String getSellingUM() {
		return sellingUM;
	}

	@JsonProperty("SellingUM")
	public void setSellingUM(String sellingUM) {
		this.sellingUM = sellingUM;
	}

	@JsonProperty("RegisterItemDescription")
	public String getRegisterItemDescription() {
		return registerItemDescription;
	}

	@JsonProperty("RegisterItemDescription")
	public void setRegisterItemDescription(String registerItemDescription) {
		this.registerItemDescription = registerItemDescription;
	}

	@JsonProperty("DiscountFlag")
	public String getDiscountFlag() {
		return discountFlag;
	}

	@JsonProperty("DiscountFlag")
	public void setDiscountFlag(String discountFlag) {
		this.discountFlag = discountFlag;
	}

	@JsonProperty("POSComment")
	public String getPOSComment() {
		return pOSComment;
	}

	@JsonProperty("POSComment")
	public void setPOSComment(String pOSComment) {
		this.pOSComment = pOSComment;
	}

	@JsonProperty("SeasonCode")
	public String getSeasonCode() {
		return seasonCode;
	}

	@JsonProperty("SeasonCode")
	public void setSeasonCode(String seasonCode) {
		this.seasonCode = seasonCode;
	}

	@JsonProperty("SerialisedItemFlag")
	public String getSerialisedItemFlag() {
		return serialisedItemFlag;
	}

	@JsonProperty("SerialisedItemFlag")
	public void setSerialisedItemFlag(String serialisedItemFlag) {
		this.serialisedItemFlag = serialisedItemFlag;
	}

	@JsonProperty("BrandCode")
	public String getBrandCode() {
		return brandCode;
	}

	@JsonProperty("BrandCode")
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	@JsonProperty("MMRPFlag")
	public String getMMRPFlag() {
		return mMRPFlag;
	}

	@JsonProperty("MMRPFlag")
	public void setMMRPFlag(String mMRPFlag) {
		this.mMRPFlag = mMRPFlag;
	}

	@JsonProperty("EmplDiscFlag")
	public String getEmplDiscFlag() {
		return emplDiscFlag;
	}

	@JsonProperty("EmplDiscFlag")
	public void setEmplDiscFlag(String emplDiscFlag) {
		this.emplDiscFlag = emplDiscFlag;
	}

	@JsonProperty("PriceModflag")
	public String getPriceModflag() {
		return priceModflag;
	}

	@JsonProperty("PriceModflag")
	public void setPriceModflag(String priceModflag) {
		this.priceModflag = priceModflag;
	}

	@JsonProperty("PlaceholderItmMsg")
	public String getPlaceholderItmMsg() {
		return placeholderItmMsg;
	}

	@JsonProperty("PlaceholderItmMsg")
	public void setPlaceholderItmMsg(String placeholderItmMsg) {
		this.placeholderItmMsg = placeholderItmMsg;
	}

	@JsonProperty("CoreSku")
	public String getCoreSku() {
		return coreSku;
	}

	@JsonProperty("CoreSku")
	public void setCoreSku(String coreSku) {
		this.coreSku = coreSku;
	}

	@JsonProperty("LoyaltyPromoAllowedFlag")
	public String getLoyaltyPromoAllowedFlag() {
		return loyaltyPromoAllowedFlag;
	}

	@JsonProperty("LoyaltyPromoAllowedFlag")
	public void setLoyaltyPromoAllowedFlag(String loyaltyPromoAllowedFlag) {
		this.loyaltyPromoAllowedFlag = loyaltyPromoAllowedFlag;
	}

	@JsonProperty("TRNItemMsg")
	public String getTRNItemMsg() {
		return tRNItemMsg;
	}

	@JsonProperty("TRNItemMsg")
	public void setTRNItemMsg(String tRNItemMsg) {
		this.tRNItemMsg = tRNItemMsg;
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