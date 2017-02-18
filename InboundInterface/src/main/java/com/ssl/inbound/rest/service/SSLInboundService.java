package com.ssl.inbound.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.ssl.inbound.rest.beans.BrandImportRequest;
import com.ssl.inbound.rest.beans.ColorImportRequest;
import com.ssl.inbound.rest.beans.ItemImportRequest;
import com.ssl.inbound.rest.beans.MerchandiseImportRequest;
import com.ssl.inbound.rest.beans.PromotionImportRequest;
import com.ssl.inbound.rest.beans.StoreImportRequest;
import com.ssl.inbound.rest.beans.StyleImportRequest;
import com.ssl.inbound.rest.beans.TaxImportRequest;
import com.ssl.inbound.rest.beans.UpcImportRequest;
import com.ssl.inbound.rest.beans.VendorImportRequest;


@Path("/InboundServices")
public class SSLInboundService {

	private static Logger logger = Logger.getLogger(SSLInboundService.class);


	//Brand Interface: Start	
	@POST
	@Path("/brand")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertBrandInfo(BrandImportRequest brandImportRequest ) {
		return SSLInboundServiceImpl.insertBrandInfo(brandImportRequest);
	}

	@PUT
	@Path("/brand")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateBrandInfo(BrandImportRequest brandImportRequest  ) {
		return SSLInboundServiceImpl.updateBrandInfo(brandImportRequest);
	}

	@DELETE
	@Path("/brand")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteBrandInfo(BrandImportRequest brandImportRequest  ) {
		return SSLInboundServiceImpl.deleteBrandInfo(brandImportRequest);
	}	
	//Brand Interface: End

	//Item Interface: Start	
	@POST
	@Path("/items")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertItemsInfo(ItemImportRequest itemImportRequest ) {
		return SSLInboundServiceImpl.insertItemsInfo(itemImportRequest);
	}

	@PUT
	@Path("/items")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateItemsInfo(ItemImportRequest itemImportRequest ) {
		return SSLInboundServiceImpl.updateItemsInfo(itemImportRequest);
	}

	@DELETE
	@Path("/items")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteMerchandiseInfo(ItemImportRequest itemImportRequest  ) {
		return SSLInboundServiceImpl.deleteItemsInfo(itemImportRequest);
	}	
	//Item Interface: End

	//Merchandise Interface: Start	
	@POST
	@Path("/merchandise")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertMerchandiseInfo(MerchandiseImportRequest merchandiseImportRequest ) {
		return SSLInboundServiceImpl.insertMerchandiseInfo(merchandiseImportRequest);
	}

	@PUT
	@Path("/merchandise")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateMerchandiseInfo(MerchandiseImportRequest merchandiseImportRequest ) {
		return SSLInboundServiceImpl.updateMerchandiseInfo(merchandiseImportRequest);
	}

	@DELETE
	@Path("/merchandise")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteMerchandiseInfo(MerchandiseImportRequest merchandiseImportRequest  ) {
		return SSLInboundServiceImpl.deleteMerchandiseInfo(merchandiseImportRequest);
	}	
	//Merchandise Interface: End

	//Promotion Interface: Start	
	@POST
	@Path("/promotion")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertPromotionInfo(PromotionImportRequest promotionImportRequest ) {
		return SSLInboundServiceImpl.insertPromotionInfo(promotionImportRequest);
	}

	@PUT
	@Path("/promotion")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updatePromotionInfo(PromotionImportRequest promotionImportRequest ) {
		return SSLInboundServiceImpl.updatePromotionInfo(promotionImportRequest);
	}

	@DELETE
	@Path("/promotion")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletePromotionInfo(PromotionImportRequest promotionImportRequest  ) {
		return SSLInboundServiceImpl.deletePromotionInfo(promotionImportRequest);
	}	
	//Promotion Interface: End

	//Store Hierarchy Interface: Start	
	@POST
	@Path("/storehierarchy")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertStoreInfo(StoreImportRequest storeImportRequest ) {
		return SSLInboundServiceImpl.insertStoreInfo(storeImportRequest);
	}

	@PUT
	@Path("/storehierarchy")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateStoreInfo(StoreImportRequest storeImportRequest ) {
		return SSLInboundServiceImpl.updateStoreInfo(storeImportRequest);
	}

	@DELETE
	@Path("/storehierarchy")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteStoreInfo(StoreImportRequest storeImportRequest  ) {
		return SSLInboundServiceImpl.deleteStoreInfo(storeImportRequest);
	}	
	//Store Hierarchy Interface: End

	//Style Hierarchy Interface: Start	
	@POST
	@Path("/style")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertStyleInfo(StyleImportRequest styleImportRequest ) {
		return SSLInboundServiceImpl.insertStyleInfo(styleImportRequest);
	}

	@PUT
	@Path("/style")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateStyleInfo(StyleImportRequest styleImportRequest) {
		return SSLInboundServiceImpl.updateStyleInfo(styleImportRequest);
	}

	@DELETE
	@Path("/style")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteStyleInfo(StyleImportRequest styleImportRequest) {
		return SSLInboundServiceImpl.deleteStyleInfo(styleImportRequest);
	}	
	//Style Hierarchy Interface: End

	//Tax Hierarchy Interface: Start	
	@POST
	@Path("/tax")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertTaxInfo(TaxImportRequest taxImportRequest ) {
		return SSLInboundServiceImpl.insertTaxInfo(taxImportRequest);
	}

	@PUT
	@Path("/tax")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateTaxInfo(TaxImportRequest taxImportRequest ) {
		return SSLInboundServiceImpl.updateTaxInfo(taxImportRequest);
	}

	@DELETE
	@Path("/tax")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteTaxInfo(TaxImportRequest taxImportRequest ) {
		return SSLInboundServiceImpl.deleteTaxInfo(taxImportRequest);
	}	
	//Tax Hierarchy Interface: End

	//UPC Hierarchy Interface: Start	
	@POST
	@Path("/upc")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertUpcInfo(UpcImportRequest upcImportRequest ) {
		return SSLInboundServiceImpl.insertUpcInfo(upcImportRequest);
	}

	@PUT
	@Path("/upc")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUpcInfo(UpcImportRequest upcImportRequest ) {
		return SSLInboundServiceImpl.updateUpcInfo(upcImportRequest);
	}

	@DELETE
	@Path("/upc")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUpcInfo(UpcImportRequest upcImportRequest ) {
		return SSLInboundServiceImpl.deleteUpcInfo(upcImportRequest);
	}	
	//UPC Hierarchy Interface: End

	//Vendor Hierarchy Interface: Start	
	@POST
	@Path("/vendor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertVendorInfo(VendorImportRequest vendorImportRequest ) {
		return SSLInboundServiceImpl.insertVendorInfo(vendorImportRequest);
	}

	@PUT
	@Path("/vendor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateVendorInfo(VendorImportRequest vendorImportRequest ) {
		return SSLInboundServiceImpl.updateVendorInfo(vendorImportRequest);
	}

	@DELETE
	@Path("/vendor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteVendorInfo(VendorImportRequest vendorImportRequest ) {
		return SSLInboundServiceImpl.deleteVendorInfo(vendorImportRequest);
	}	
	//Vendor Hierarchy Interface: End

	//Color Interface: Start	
	@POST
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertColorInfo(ColorImportRequest colorImportRequest ) {
		return SSLInboundServiceImpl.insertColorInfo(colorImportRequest);
	}

	@PUT
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateColorInfo(ColorImportRequest colorImportRequest ) {
		return SSLInboundServiceImpl.updateColorInfo(colorImportRequest);
	}

	@DELETE
	@Path("/colors")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteColorInfo(ColorImportRequest colorImportRequest ) {
		return SSLInboundServiceImpl.deleteColorInfo(colorImportRequest);
	}	
	//Color Interface: End
}
