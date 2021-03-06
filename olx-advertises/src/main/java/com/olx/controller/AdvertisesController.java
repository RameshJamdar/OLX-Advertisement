package com.olx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.entity.AdvertiseEntity;
import com.olx.service.AdvertiseService;

@RestController
@RequestMapping(value="olx/advertiseapi")
public class AdvertisesController {

	@Autowired(required = true)
	private AdvertiseService advertisesService;

	@PostMapping("/advertise ")
	public AdvertiseEntity createNewAdvertise(@RequestBody AdvertiseEntity advertiseEntity) {
		return advertisesService.createNewAdvertise(advertiseEntity);

	}

	@PutMapping("/{id}")
	public AdvertiseEntity updateAdvertises(@PathVariable int id) {
		return advertisesService.updateAdvertise(id);
	}

	@GetMapping("/{id}")
	public AdvertiseEntity getPerticularAdvertise(@PathVariable("id") int id) {
		return advertisesService.getAdvertiseById(id);
	}

	@DeleteMapping("/{id}/DELETE")
	public String deleteAdvertise(@PathVariable("id") int id) {
		return advertisesService.deleteAdvertiseById(id);
	}

}
