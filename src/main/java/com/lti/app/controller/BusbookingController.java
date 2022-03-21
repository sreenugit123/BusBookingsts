package com.lti.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.lti.app.pojo.Busdetails;
import com.lti.app.service.BusbookingService;

import org.springframework.web.bind.annotation.CrossOrigin;




@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200") 
public class BusbookingController 
{
	@Autowired
	BusbookingService bService;
	
	@GetMapping("/busdetails")
	public List<Busdetails> getBusdetails()
	{
		return bService.getBusdetails();
	}
    
	@PostMapping("/busdetails")
	public boolean addVehicle(@RequestBody Busdetails busdetails)
	{
		return bService.addBusdetails(busdetails);
	}
	@GetMapping("/busdetails/{busid}")    // Passing Argument with URL and Finding the Object
	public Busdetails findBusdetails(@PathVariable("busid") String busid)
	{
			return bService.findBusdetails(busid);
	}
	@GetMapping("/busdetails/{fcity}/{tcity}/{date}")    // Passing Argument with URL and Finding the Object
	public List<Busdetails> findBusdetails(@PathVariable("fcity") String fcity,@PathVariable("tcity") String tcity,@PathVariable("date") String date)
	{
			return bService.searchBusdetails(fcity,tcity,date);
	}
	/*@GetMapping("/vehicle/{vehicleid}")
	public Vehicle findVehicle(@PathVariable("vehicleid") String vehicleId)
	{
			return vService.findVehicle(vehicleId);
	} */

}
