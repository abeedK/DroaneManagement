package com.cts.droamemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.droamemanagement.domain.Location;
import com.cts.droamemanagement.service.Locationservice;

@RestController
public class Locationcontroller {
	@Autowired
	private Locationservice locationService;
	
	@GetMapping(path="/rest/location/getall")
	public List<Location> getAll(){
		return locationService.getAll();
	}

}
