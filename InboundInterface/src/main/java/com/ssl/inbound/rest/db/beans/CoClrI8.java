package com.ssl.inbound.rest.db.beans;

import java.io.Serializable;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CO_CLR_I8")
public class CoClrI8
implements Serializable
{
	private static final long serialVersionUID = 8930864402918150188L;
	private CoClrI8Id id;
	private String nmClr;
	private String deClr;
	private String sslBizFrmt;

	public CoClrI8() {}

	public CoClrI8(CoClrI8Id id)
	{
		this.id = id;
	}

	public CoClrI8(CoClrI8Id id, String nmClr, String deClr, String sslBizFrmt)
	{
		this.id = id;
		this.nmClr = nmClr;
		this.deClr = deClr;
		this.sslBizFrmt = sslBizFrmt;
	}

	@EmbeddedId
	@AttributeOverrides({@javax.persistence.AttributeOverride(name="edClr", column=@Column(name="ED_CLR", nullable=false, length=20)), @javax.persistence.AttributeOverride(name="lcl", column=@Column(name="LCL", nullable=false, length=10))})
	public CoClrI8Id getId()
	{
		return this.id;
	}

	public void setId(CoClrI8Id id)
	{
		this.id = id;
	}

	@Column(name="NM_CLR", length=120)
	public String getNmClr()
	{
		return this.nmClr;
	}

	public void setNmClr(String nmClr)
	{
		this.nmClr = nmClr;
	}

	@Column(name="DE_CLR", length=250)
	public String getDeClr()
	{
		return this.deClr;
	}

	public void setDeClr(String deClr)
	{
		this.deClr = deClr;
	}

	@Column(name="SSL_BIZ_FRMT", length=20)
	public String getSslBizFrmt()
	{
		return this.sslBizFrmt;
	}

	public void setSslBizFrmt(String sslBizFrmt)
	{
		this.sslBizFrmt = sslBizFrmt;
	}
}
