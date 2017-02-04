/**
 * 
 */
package com.ssl.inbound.rest.sqlIfc;

/**
 * @author Srikanth
 *
 */
public interface PriceUpdateSQLIfc 
{

	String CO_EV_SEQ_Select = "SELECT CO_EV_SEQ.NEXTVAL as EVENT_ID FROM DUAL";
	
	String CO_EV_INSERT = "INSERT INTO CO_EV (ID_EV,ID_STR_RT,NM_EV,DE_EV,TY_EV,SC_EV,CC_EV,NM_EV_OWNR,DC_DY_BSN_SS,DC_DY_BSN_SE,DC_DY_BSN_AS,DC_DY_BSN_AE,TS_EV_PL_EF,TS_EV_PL_EP,TS_EV_ACT_EF,TS_EV_ACT_EP,ID_EV_EXT,TS_CRT_RCRD,TS_MDF_RCRD,SSL_FL_PRC_INT)"
					+ " VALUES("
					+ "	?, "
					+ "	LPAD(?,5,0), "
					+ "	?, "
					+ "	?, "
					+ "	?, "
					+ "	'PENDING', NULL, NULL,"
					+ "	?, "
					+ "	?, "
					+ "	?, "
					+ "	?, "
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')),"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')) + interval '1439' minute,"
					+ " TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')),"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')) + interval '1439' minute,"
					+ " ?, "
					+ "	SYSDATE, SYSDATE,'1')";
	
	String CO_EV_I8_INSERT = "INSERT INTO CO_EV_I8 (ID_EV,ID_STR_RT,LCL,NM_EV,DE_EV) "
					+ "	VALUES ("
					+ "	?,"
					+ "	LPAD(?,5,0),"
					+ "	'en',"
					+ "	?,"
					+ "	?)	";
	
	String CO_EV_MNT_INSERT = "INSERT INTO CO_EV_MNT (ID_EV,ID_STR_RT,NM_EV_MNT,DE_EV_MNT,TS_EV_MNT_EF,TS_EV_MNT_EP,TY_EV_MNT,SC_EV_MNT,RC_EV_MNT,TY_EV_MNT_ORG,"
					+ "	ID_EM,ID_CMP,TS_EV_MNT_CRT,TS_EV_MNT_APLY,ID_JOB_ST,ID_JOB_END,SC_EV_MNT_EF,SC_EV_MNT_EP,TS_CRT_RCRD,TS_MDF_RCRD)"
					+ "	VALUES ("
					+ "	?,"
					+ "	LPAD(?,5,0),"
					+ "	?,"
					+ "	?,"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')),"
					+ "	DECODE(?,'R',null,'P',TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')) + interval '1439' minute),"
					+ "	?,"
					+ " NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,SYSDATE,SYSDATE)";
	
	String CO_EV_MNT_I8_INSERT = "INSERT INTO CO_EV_MNT_I8(ID_EV,ID_STR_RT,LCL,NM_EV_MNT,DE_EV_MNT) "
					+ "	VALUES ("
					+ "	?,"
					+ "	LPAD(?,5,0),"
					+ "	'en',"
					+ "	?,"
					+ "	?)";
	
	String MA_PRC_ITM_INSERT = "INSERT INTO MA_PRC_ITM (ID_EV,ID_STR_RT,TY_PRC_MNT,UN_PRI_EV,UN_DG_LS_PRC,ID_TMPLT_LB,ID_PRCGP,TS_CRT_RCRD,TS_MDF_RCRD)"
					+ "	VALUES ("
					+ " ?,"
					+ "	LPAD(?,5,0),"
					+ "	?,"
					+ "	0," // hard coded to 0 priority:value from OSDIPLU
					+ "	NULL,NULL,0,SYSDATE,SYSDATE)";
	
	String CO_MNT_ITM_INSERT = "INSERT INTO CO_MNT_ITM ( ID_EV, ID_STR_RT,LU_EV_ITM_MNT, TS_CRT_RCRD, TS_MDF_RCRD) "
					+ "	VALUES ("
					+ "	?,"
					+ "	LPAD(?,5,0),"
					+ " NULL,SYSDATE,SYSDATE )";
	
	//R type
	
	String TR_CHN_PRN_PRC_INSERT = "INSERT INTO TR_CHN_PRN_PRC (ID_EV,ID_STR_RT,MO_CHN_PRN_UN_PRC,TY_CHN_PRN_UN_PRC,TS_CRT_RCRD,TS_MDF_RCRD)"
					+ " VALUES ("
					+ "	?,"
					+ "	LPAD(TRIM(?),5,0),"
					+ "	NULL,NULL,SYSDATE,SYSDATE)";
		
	String MA_ITM_PRN_PRC_ITM_INSERT = "INSERT INTO MA_ITM_PRN_PRC_ITM (ID_EV,ID_STR_RT,ID_ITM,ID_TMPLT_LB,MO_OVRD_PRC,TS_CRT_RCRD,TS_MDF_RCRD,SSL_TS_EV_MNT_EF,SSL_TS_EV_MNT_EP,SSL_ID_EV_EXT)"
					+ "	VALUES ("
					+ "	?,"
					+ "	LPAD(?,5,0),"
					+ "	?,"
					+ "	NULL,"
					+ "	?,"
					+ "	SYSDATE,SYSDATE,"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')),"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')) + interval '1439' minute,"
					+ "	?)";
	
	//P Type
	
	String TR_CHN_TMP_PRC_INSERT = "INSERT INTO TR_CHN_TMP_PRC (ID_EV,ID_STR_RT,MO_UN_TMP_PRC_CHN,TY_UN_TMP_PRC_CHN,TS_CRT_RCRD,TS_MDF_RCRD) "
					+ " VALUES ("
					+ "	?,"
					+ "	LPAD(TRIM(?),5,0),"
					+ "	NULL,NULL,SYSDATE,SYSDATE)";
	
	String MA_ITM_TMP_PRC_CHN_INSERT = "INSERT INTO MA_ITM_TMP_PRC_CHN (ID_EV,ID_STR_RT,ID_ITM,MO_OVRD_PRC,ID_TMPLT_LB,ID_PRM,ID_PRM_CMP,ID_PRM_CMP_DTL,TS_CRT_RCRD,TS_MDF_RCRD,SSL_TS_EV_MNT_EF,SSL_TS_EV_MNT_EP,SSL_ID_EV_EXT)"
					+ " VALUES ("
					+ "	?,"
					+ "	LPAD(TRIM(?),5,0),"
					+ " ?,"
					+ "	?,"
					+ "	NULL,0,0,0,SYSDATE,SYSDATE,"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')),"
					+ "	TO_TIMESTAMP(TO_DATE(?,'YYYY-MM-DD')) + interval '1439' minute,"
					+ "	?)";
}
