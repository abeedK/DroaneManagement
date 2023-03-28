package com.cts.droamemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.droamemanagement.domain.Droneshotdetails;
import com.cts.droamemanagement.repository.DroneshotRepositoryIfc;

@Service
public class Droneshotservice {
	
	@Autowired
	private DroneshotRepositoryIfc droneShotRepo;
	
	public List<Droneshotdetails> getAllDroneShots(){
		
		return (List<Droneshotdetails>) droneShotRepo.findAll();
		
	}

}
