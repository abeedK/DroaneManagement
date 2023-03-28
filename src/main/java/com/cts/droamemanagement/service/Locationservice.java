package com.cts.droamemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.droamemanagement.domain.Location;
import com.cts.droamemanagement.repository.LocationRepoitoryIfc;

@Service
public class Locationservice {
	@Autowired
	private LocationRepoitoryIfc locationRepo;
	
	public List<Location> getAll(){
		return (List<Location>) locationRepo.findAll();
	}

}
