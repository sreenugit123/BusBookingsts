package com.lti.app.dao;

import javax.persistence.EntityManager;


import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.app.pojo.Busdetails;
import com.lti.app.pojo.Busseats;

import java.util.List;

@Repository
public class BusbookingDAOImpl implements BusbookingDAO
{
	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addBusdetails(Busdetails busdetails) {
	eMan.persist(busdetails);
	return true;
	}
	
	@Override
	public List<Busdetails> getBusdetails(){
		return eMan.createQuery("from Busdetails").getResultList();
	}
	@Override
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date){
		Query qry2= eMan.createQuery("from Busdetails b where b.fcity = ?1 and b.tcity =?2 and b.djourn=?3");
        qry2.setParameter(1,fcity);
        qry2.setParameter(2, tcity);
        qry2.setParameter(3, date);
		List<Busdetails> res=qry2.getResultList();
		return res;
	}
	
	@Override
	public Busdetails findBusdetails(String busid) {
				Busdetails obj=eMan.find(Busdetails.class,busid);
		return obj;
	}


	
	@Override
	public boolean addBusseats(Busseats busseats) {
	eMan.persist(busseats);
	return true;
	}
	
	@Override
	public List<Busseats> getBusseats(){
		return eMan.createQuery("from Busseats").getResultList();
	}
	
	@Override
	public List<Busseats> findBusseats(String busid) {
       Query qry2= eMan.createQuery("from Busseats b where b.bid = ?1");
        qry2.setParameter(1,busid);
		List<Busseats> res=qry2.getResultList();
		return res;
	}
	@Override
	public boolean updateBusseats(String bid,String sstatus,String sno) {
		  Query qry2= eMan.createQuery("update Busseats  b set   b.sstatus=?1 where  b.bid = ?2 and b.sno=?3");
	        qry2.setParameter(1,sstatus);
	        qry2.setParameter(2,bid);
	        qry2.setParameter(3,sno);
			int count=qry2.executeUpdate();
			if(count>0)
				return true;
		    else
				return false;

	}
	
	
	

}

