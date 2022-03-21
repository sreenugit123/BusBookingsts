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
import com.lti.app.pojo.Busseats;
import com.lti.app.service.BusbookingService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/new/api/")
@CrossOrigin("http://localhost:4200") 
public class BuseatsController 
{
	@Autowired
	BusbookingService bService;
	
	
	@GetMapping("/busseats")
	public List<Busseats> getAllBusseats()
	{
		return bService.getBusseats();
	}
    
	@PostMapping("/busseats")
	public boolean addSeats(@RequestBody Busseats busseats)
	{
		return bService.addBusseats(busseats);
	}
	@GetMapping("/busseats/{bid}")          // Passing Argument with URL and Finding the Object
	public List<Busseats> findBusseats(@PathVariable(name="bid") String busid)
	{
			return bService.findBusseats(busid);
	}

}
