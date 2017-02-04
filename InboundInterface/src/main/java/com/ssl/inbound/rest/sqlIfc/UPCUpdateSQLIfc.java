/**
 * 
 */
package com.ssl.inbound.rest.sqlIfc;

/**
 * @author Srikanth
 *
 */
public interface UPCUpdateSQLIfc 
{

	//UPC Code
	
	String  UPC_Insert = "INSERT INTO ID_IDN_PS (ID_STR_RT, ID_ITM_POS, ID_ITM, DE_ITM_POS, RP_SLS_POS_CRT, FL_PNT_FQ_SHPR_EL, ID_MF, ID_ITM_MF_UPC, ID_AGNT_RTN,"
			+ "	FL_DSC_AF_DSC_ALW, LU_VT_PS_CPN, DT_END_PS_CPN_OFR, QU_UN_BLK_MNM, QU_UN_BLK_MXM, FL_DSC_MRK_BSK_ALW,"
			+ "	FL_DSC_CT_ACNT_ALW, FL_DSC_EM_ALW, FL_CPN_ALW_MULTY, FL_FD_STP_ALW, FL_CPN_ELNTC, FL_CPN_RST, FL_ENTR_PRC_RQ,"
			+ "	FL_QR_ENR_WT, FL_KY_PRH_QTY, FL_RTN_PRH, FL_ITM_GWY, FL_ITM_WIC, FL_PRC_VS_VR, FL_KY_PRH_RPT, FL_SPO_ITM,"
			+ "	QU_PNT_FQ_SHPR, LU_GP_TND_RST, FC_FMY_MF, FL_MDFR_RT_PRC, ID_PRM, ID_PRM_CMP, ID_PRM_CMP_DTL, TS_CRT_RCRD, TS_MDF_RCRD,SSL_BIZ_FRMT)"
			+ "	VALUES("
			+ " LPAD(?,5,0),"
			+ " ?,"
			+ " ?,"
			+ " ?,"
			+ " NULL,NULL,NULL,"
			+ " ?,"
			+ " NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,"
			+ " DECODE(?,'Y',1,0),"
			+ " NULL,NULL,NULL,NULL,"
			+ " DECODE(?,'Y','1','0'),"
			+ "	NULL,'0','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,"
			+ " DECODE(?,'Y',1,0),"
			+ " 0,0,0,SYSDATE,SYSDATE,"
			+ " ?)";
}
