package com.ssl.inbound.rest.db.beans;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CO_CLR")
public class CoClr
implements Serializable
{
	private static final long serialVersionUID = -3123764274812088523L;
	@Id
	@Column(name="ED_CLR", unique=true, nullable=false, length=20)
	private String edClr;
	@Column(name="NM_CLR", length=120)
	private String nmClr;
	@Column(name="DE_CLR", length=250)
	private String deClr;
	@Column(name="TS_CRT_RCRD")
	private Timestamp tsCrtRcrd;
	@Column(name="TS_MDF_RCRD")
	private Timestamp tsMdfRcrd;
	@Column(name="SSL_BIZ_FRMT", length=20)
	private String sslBizFrmt;

	public CoClr() {}

	public CoClr(String edClr)
	{
		this.edClr = edClr;
	}

	public CoClr(String edClr, String nmClr, String deClr, Timestamp tsCrtRcrd, Timestamp tsMdfRcrd, String sslBizFrmt)
	{
		this.edClr = edClr;
		this.nmClr = nmClr;
		this.deClr = deClr;
		this.tsCrtRcrd = tsCrtRcrd;
		this.tsMdfRcrd = tsMdfRcrd;
		this.sslBizFrmt = sslBizFrmt;
	}

	public String getEdClr()
	{
		return this.edClr;
	}

	public void setEdClr(String edClr)
	{
		this.edClr = edClr;
	}

	public String getNmClr()
	{
		return this.nmClr;
	}

	public void setNmClr(String nmClr)
	{
		this.nmClr = nmClr;
	}

	public String getDeClr()
	{
		return this.deClr;
	}

	public void setDeClr(String deClr)
	{
		this.deClr = deClr;
	}

	public Timestamp getTsCrtRcrd()
	{
		return this.tsCrtRcrd;
	}

	public void setTsCrtRcrd(Timestamp tsCrtRcrd)
	{
		this.tsCrtRcrd = tsCrtRcrd;
	}

	public Timestamp getTsMdfRcrd()
	{
		return this.tsMdfRcrd;
	}

	public void setTsMdfRcrd(Timestamp tsMdfRcrd)
	{
		this.tsMdfRcrd = tsMdfRcrd;
	}

	public String getSslBizFrmt()
	{
		return this.sslBizFrmt;
	}

	public void setSslBizFrmt(String sslBizFrmt)
	{
		this.sslBizFrmt = sslBizFrmt;
	}

	public String toString()
	{
		return "CoClr [edClr=" + this.edClr + ", nmClr=" + this.nmClr + ", deClr=" + this.deClr + ", tsCrtRcrd=" + this.tsCrtRcrd + ", tsMdfRcrd=" + this.tsMdfRcrd + ", sslBizFrmt=" + this.sslBizFrmt + "]";
	}
}
