package com.ssl.inbound.rest.service.dao;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.ssl.inbound.rest.beans.Color;
import com.ssl.inbound.rest.db.beans.CoClr;
import com.ssl.inbound.rest.db.beans.CoClrI8;
import com.ssl.inbound.rest.db.beans.CoClrI8Id;
import com.ssl.inbound.rest.db.utils.DBSession;

public class ColorDAO 
{
	private static Logger logger = Logger.getLogger(ColorDAO.class);

	public static void createOrUpdate(Color color) {
		Session colorSession = DBSession.getSessionFactory().openSession();
		colorSession.beginTransaction();
		
		CoClr coClr = new CoClr();
		CoClrI8 coClrI8 = new CoClrI8();
		CoClrI8Id coClrI8Id = new CoClrI8Id();
		
		coClr.setEdClr(color.getColorCode());
		coClr.setDeClr(color.getColorDescription());
		coClr.setNmClr(color.getColorNames());
		coClr.setSslBizFrmt(color.getBusinessFormat());
		
		coClrI8Id.setEdClr(color.getColorCode());
		coClrI8Id.setLcl("en");
		coClrI8.setId(coClrI8Id);
		
		coClrI8.setDeClr(color.getColorDescription());
		coClrI8.setNmClr(color.getColorNames());
		coClrI8.setSslBizFrmt(color.getBusinessFormat());
		
		colorSession.saveOrUpdate(coClr);
		colorSession.getTransaction().commit();
		colorSession.close();
		
		Session colorI8Session = DBSession.getSessionFactory().openSession();
		colorI8Session.beginTransaction();
		colorI8Session.saveOrUpdate(coClrI8);		
		colorI8Session.getTransaction().commit();		
		colorI8Session.close();
		System.out.println("Color: "+coClr+"Successfully created.");
	}

	public static void delete(Color color) {
		Session colorSession = DBSession.getSessionFactory().openSession();
		colorSession.beginTransaction();
		
		CoClr coClr = new CoClr();
		CoClrI8 coClrI8 = new CoClrI8();
		CoClrI8Id coClrI8Id = new CoClrI8Id();
		
		coClr.setEdClr(color.getColorCode());
		coClr.setSslBizFrmt(color.getBusinessFormat());
		
		coClrI8Id.setEdClr(color.getColorCode());
		coClrI8Id.setLcl("en");
		coClrI8.setId(coClrI8Id);
		
		coClrI8.setSslBizFrmt(color.getBusinessFormat());
		
		coClr = findColorByID(colorSession, color.getColorCode());
		colorSession.delete(coClr);
		colorSession.getTransaction().commit();
		colorSession.close();
		
		Session colorI8Session = DBSession.getSessionFactory().openSession();
		colorI8Session.beginTransaction();
		coClrI8 = findColorI8ByID(colorI8Session, color.getColorCode());
		colorI8Session.delete(coClrI8);
		colorI8Session.getTransaction().commit();
		colorI8Session.close();
		
		System.out.println("Successfully deleted ");
	}
	
	public static CoClr findColorByID(Session colorSession, String colorCode) {

		CoClr coClr = null;
		Query query = colorSession.createQuery("from CoClr where edClr = "+colorCode);
		@SuppressWarnings("unchecked")
		List<CoClr> result = (List<CoClr>)query.list();
		
		if(result != null && result.size() > 0)
		{
			for (CoClr coClrObejct : result) 
			{
				coClr = coClrObejct;
			}
		}
		return coClr;
	}
	
	public static CoClrI8 findColorI8ByID(Session colorI8Session, String colorCode) {
		CoClrI8 coClrI8 = null;
		
		CoClrI8Id coClrI8Id = new CoClrI8Id();
		coClrI8Id.setEdClr(colorCode);
		
		Criteria crit = colorI8Session.createCriteria(CoClrI8.class);
		crit.add(Restrictions.eq("id.edClr",colorCode));
		
		@SuppressWarnings("unchecked")
		List<CoClrI8> result = (List<CoClrI8>)crit.list();
		
		if(result != null && result.size() > 0)
		{
			for (CoClrI8 coClrI8Obejct : result) 
			{
				coClrI8 = coClrI8Obejct;
			}
		}
		return coClrI8;
	}
}
