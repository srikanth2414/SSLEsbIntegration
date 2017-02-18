package com.ssl.inbound.rest.service;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

import com.ssl.inbound.rest.beans.BrandImportRequest;
import com.ssl.inbound.rest.beans.Color;
import com.ssl.inbound.rest.beans.ColorImportRequest;
import com.ssl.inbound.rest.beans.ItemImportRequest;
import com.ssl.inbound.rest.beans.MerchandiseImportRequest;
import com.ssl.inbound.rest.beans.PromotionImportRequest;
import com.ssl.inbound.rest.beans.ServiceResponse;
import com.ssl.inbound.rest.beans.StoreImportRequest;
import com.ssl.inbound.rest.beans.StyleImportRequest;
import com.ssl.inbound.rest.beans.TaxImportRequest;
import com.ssl.inbound.rest.beans.UpcImportRequest;
import com.ssl.inbound.rest.beans.VendorImportRequest;
import com.ssl.inbound.rest.service.dao.ColorDAO;

public class SSLInboundServiceImpl {

	private static Logger logger = Logger.getLogger(SSLInboundServiceImpl.class);

	//Brand Interface: Start
	public static Response insertBrandInfo(BrandImportRequest brandImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateBrandInfo(BrandImportRequest brandImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteBrandInfo(BrandImportRequest brandImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Brand Interface: End

	//Item Interface: Start
	public static Response insertItemsInfo(ItemImportRequest itemImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateItemsInfo(ItemImportRequest itemImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteItemsInfo(ItemImportRequest itemImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Item Interface: End

	//Merchandise Interface: Start
	public static Response insertMerchandiseInfo(MerchandiseImportRequest merchandiseImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateMerchandiseInfo(MerchandiseImportRequest merchandiseImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteMerchandiseInfo(MerchandiseImportRequest merchandiseImportRequest  ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Merchandise Interface: End

	//Promotion Interface: Start
	public static Response insertPromotionInfo(PromotionImportRequest promotionImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updatePromotionInfo(PromotionImportRequest promotionImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deletePromotionInfo(PromotionImportRequest promotionImportRequest  ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Promotion Interface: End

	//Store Hierarchy Interface: Start
	public static Response insertStoreInfo(StoreImportRequest storeImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateStoreInfo(StoreImportRequest storeImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteStoreInfo(StoreImportRequest storeImportRequest  )  {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Store Hierarchy Interface: End

	//Style Hierarchy Interface: Start
	public static Response insertStyleInfo(StyleImportRequest styleImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateStyleInfo(StyleImportRequest styleImportRequest) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteStyleInfo(StyleImportRequest styleImportRequest)  {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Style Hierarchy Interface: End

	//Tax Hierarchy Interface: Start
	public static Response insertTaxInfo(TaxImportRequest taxImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateTaxInfo(TaxImportRequest taxImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteTaxInfo(TaxImportRequest taxImportRequest )  {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Tax Hierarchy Interface: End

	//UPC Hierarchy Interface: Start
	public static Response insertUpcInfo(UpcImportRequest upcImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateUpcInfo(UpcImportRequest upcImportRequest )  {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteUpcInfo(UpcImportRequest upcImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//UPC Hierarchy Interface: End
	
	//Vendor Hierarchy Interface: Start
		public static Response insertVendorInfo(VendorImportRequest vendorImportRequest ) {

			List<Color> colorImports =  colorImportRequest.getColors();
			ServiceResponse serviceResponse = new ServiceResponse();

			for (Color color : colorImports)
			{
				if(color != null)
				{
					if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
							|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
					{
						try
						{
							ColorDAO.createOrUpdate(color);

							serviceResponse.setCorelationID(color.getCorelationID());
							serviceResponse.setResponseCode("100");
							serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
						}
						catch(Exception exception)
						{
							serviceResponse.setCorelationID(color.getCorelationID());
							serviceResponse.setErrorCode("PRD000003");
							serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
						}
					}
					else
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000001");
						serviceResponse.setErrorMessage("Mandatory parameter is Empty");
					}
				}
				else
				{
					//TODO:Color Object is null
				}
			}

			if(serviceResponse.getErrorCode() != null)
			{
				return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
			}
			else
			{
				return Response.status(Status.OK).entity(serviceResponse).build();
			}
		}

		public static Response updateVendorInfo(VendorImportRequest vendorImportRequest )  {

			List<Color> colorImports =  colorImportRequest.getColors();
			ServiceResponse serviceResponse = new ServiceResponse();

			for (Color color : colorImports)
			{
				if(color != null)
				{
					if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
							|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
					{
						try
						{
							ColorDAO.createOrUpdate(color);

							serviceResponse.setCorelationID(color.getCorelationID());
							serviceResponse.setResponseCode("100");
							serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
						}
						catch(Exception exception)
						{
							serviceResponse.setCorelationID(color.getCorelationID());
							serviceResponse.setErrorCode("PRD000003");
							serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
						}
					}
					else
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000001");
						serviceResponse.setErrorMessage("Mandatory parameter is Empty");
					}
				}
				else
				{
					//TODO:Color Object is null
				}
			}

			if(serviceResponse.getErrorCode() != null)
			{
				return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
			}
			else
			{
				return Response.status(Status.OK).entity(serviceResponse).build();
			}
		}

		public static Response deleteVendorInfo(VendorImportRequest vendorImportRequest ) {

			List<Color> colorImports =  colorImportRequest.getColors();
			ServiceResponse serviceResponse = new ServiceResponse();

			for (Color color : colorImports)
			{
				if(color != null)
				{
					if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
							|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
					{
						try
						{
							ColorDAO.delete(color);

							serviceResponse.setCorelationID(color.getCorelationID());
							serviceResponse.setResponseCode("100");
							serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
						}
						catch(Exception exception)
						{
							serviceResponse.setCorelationID(color.getCorelationID());
							serviceResponse.setErrorCode("PRD000003");
							serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
						}
					}
					else
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000001");
						serviceResponse.setErrorMessage("Mandatory parameter is Empty");
					}
				}
				else
				{
					//TODO:Color Object is null
				}
			}

			if(serviceResponse.getErrorCode() != null)
			{
				return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
			}
			else
			{
				return Response.status(Status.OK).entity(serviceResponse).build();
			}
		}
		//Vendor Hierarchy Interface: End

	//Color Interface: Start
	public static Response insertColorInfo(ColorImportRequest colorImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" inserted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while inserting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response updateColorInfo(ColorImportRequest colorImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.createOrUpdate(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" updated scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while updating Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}

	public static Response deleteColorInfo(ColorImportRequest colorImportRequest ) {

		List<Color> colorImports =  colorImportRequest.getColors();
		ServiceResponse serviceResponse = new ServiceResponse();

		for (Color color : colorImports)
		{
			if(color != null)
			{
				if(color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode()))
						|| color.getColorCode() != null && !("".equalsIgnoreCase(color.getColorCode())))
				{
					try
					{
						ColorDAO.delete(color);

						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setResponseCode("100");
						serviceResponse.setResponseMessage("Color Id:"+color.getColorCode()+" deleted scucessfully");
					}
					catch(Exception exception)
					{
						serviceResponse.setCorelationID(color.getCorelationID());
						serviceResponse.setErrorCode("PRD000003");
						serviceResponse.setErrorMessage("SQL Error while deleting Color Id:"+color.getColorCode()+" in POS");
					}
				}
				else
				{
					serviceResponse.setCorelationID(color.getCorelationID());
					serviceResponse.setErrorCode("PRD000001");
					serviceResponse.setErrorMessage("Mandatory parameter is Empty");
				}
			}
			else
			{
				//TODO:Color Object is null
			}
		}

		if(serviceResponse.getErrorCode() != null)
		{
			return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
		}
		else
		{
			return Response.status(Status.OK).entity(serviceResponse).build();
		}
	}
	//Color Interface: End
}
