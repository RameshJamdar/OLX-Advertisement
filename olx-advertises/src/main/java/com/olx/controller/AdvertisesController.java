package com.olx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.entity.AdvertiseEntity;
import com.olx.service.AdvertiseService;


@RestController
@RequestMapping("/olx")
public class AdvertisesController {
	
	@Autowired(required=true)
	private AdvertiseService advertisesService;
	
	@PostMapping(value="/advertise ")
	public ResponseEntity<AdvertiseEntity> createNewAdvertise(@RequestBody AdvertiseEntity advertiseEntity){
		 AdvertiseEntity advertise = advertisesService.createNewAdvertise(advertiseEntity);
		 return new ResponseEntity<>(advertise, HttpStatus.CREATED);
		 
		
	}

}
