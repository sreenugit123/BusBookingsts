package com.lti.app.dao;

import java.util.List;


import com.lti.app.pojo.Busdetails;
import com.lti.app.pojo.Busseats;


public interface BusbookingDAO 
{
	public boolean addBusdetails(Busdetails busdetails);
	public List<Busdetails> getBusdetails();
	public Busdetails findBusdetails(String busid);
	
	public boolean addBusseats(Busseats busseats);
	public List<Busseats> getBusseats();
	public List<Busseats> findBusseats(String busid);
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date);
	public boolean updateBusseats(String bid,String sstatus,String sno);
}
