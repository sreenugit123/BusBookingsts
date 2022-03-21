package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Busdetails;
import com.lti.app.pojo.Busseats;


public interface BusbookingService 
{
	public boolean addBusdetails(Busdetails busdetails);
	public List<Busdetails> getBusdetails();
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date);
	public Busdetails findBusdetails(String busid);
	
	public List<Busseats> findBusseats(String busid);
	public boolean addBusseats(Busseats busseats);
	public List<Busseats> getBusseats();
}
