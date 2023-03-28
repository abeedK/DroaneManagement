package com.cts.droamemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.droamemanagement.domain.Droneshotdetails;
import com.cts.droamemanagement.service.Droneshotservice;

@RestController
public class Droneshotcontroller {

	@Autowired
	private Droneshotservice droneShotService;
	
	@GetMapping(path="/rest/drone/getalldronshotdetails")
	public List<Droneshotdetails> getAll(){
		return droneShotService.getAllDroneShots();
	}
}
