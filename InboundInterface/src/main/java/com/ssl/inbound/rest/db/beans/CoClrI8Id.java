package com.ssl.inbound.rest.db.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CoClrI8Id
implements Serializable
{
	private static final long serialVersionUID = -6247432783244700051L;
	private String edClr;
	private String lcl;

	public CoClrI8Id() {}

	public CoClrI8Id(String edClr, String lcl)
	{
		this.edClr = edClr;
		this.lcl = lcl;
	}

	@Column(name="ED_CLR", nullable=false, length=20)
	public String getEdClr()
	{
		return this.edClr;
	}

	public void setEdClr(String edClr)
	{
		this.edClr = edClr;
	}

	@Column(name="LCL", nullable=false, length=10)
	public String getLcl()
	{
		return this.lcl;
	}

	public void setLcl(String lcl)
	{
		this.lcl = lcl;
	}

	public boolean equals(Object other)
	{
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof CoClrI8Id)) {
			return false;
		}
		CoClrI8Id castOther = (CoClrI8Id)other;

		return ((getEdClr() == castOther.getEdClr()) || ((getEdClr() != null) && (castOther.getEdClr() != null) && (getEdClr().equals(castOther.getEdClr())))) && ((getLcl() == castOther.getLcl()) || ((getLcl() != null) && (castOther.getLcl() != null) && (getLcl().equals(castOther.getLcl()))));
	}

	public int hashCode()
	{
		int result = 17;

		result = 37 * result + (getEdClr() == null ? 0 : getEdClr().hashCode());

		result = 37 * result + (getLcl() == null ? 0 : getLcl().hashCode());

		return result;
	}
}
