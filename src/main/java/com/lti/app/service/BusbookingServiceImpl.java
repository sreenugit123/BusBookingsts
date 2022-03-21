package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lti.app.dao.BusbookingDAO;
import com.lti.app.pojo.Busdetails;
import com.lti.app.pojo.Busseats;
import com.lti.app.service.BusbookingService;



@Service
@Transactional
public class BusbookingServiceImpl implements BusbookingService
{
	@Autowired
	BusbookingDAO bdao;
	
	@Override
	public boolean addBusdetails(Busdetails busdetails)
	{
		return  bdao.addBusdetails(busdetails);
	}
	@Override
	public List<Busdetails> getBusdetails()
	{
		return bdao.getBusdetails();
	}
	@Override
	public List<Busdetails> searchBusdetails(String fcity,String tcity,String date){
		return bdao.searchBusdetails(fcity,tcity,date);
	}
	
	@Override
	public Busdetails findBusdetails(String busid) 
	{
		return bdao.findBusdetails(busid);
	}
	
	
	@Override
	public List<Busseats> findBusseats(String busid) 
	{
		return bdao.findBusseats(busid);
	}
	
	@Override
	public boolean addBusseats(Busseats busseats)
	{
		return  bdao.addBusseats(busseats);
	}
	@Override
	public List<Busseats> getBusseats()
	{
		return bdao.getBusseats();
	}
	
}
