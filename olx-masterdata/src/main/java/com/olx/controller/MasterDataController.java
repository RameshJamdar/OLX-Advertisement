package com.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.entity.AdvStatusEntity;
import com.olx.entity.CategoryEntity;
import com.olx.service.MasterService;


@RestController
@RequestMapping("masterdata")
public class MasterDataController {
	
	@Autowired(required=true)
	private MasterService masterDataService;
	
	@GetMapping( "/advertise/category")
	public ResponseEntity<List<CategoryEntity>> getAllCategories(){
		List<CategoryEntity> categoriesList = masterDataService.getAllCategories();

		return new ResponseEntity<List<CategoryEntity>>(categoriesList, HttpStatus.OK);
	}
	
	@GetMapping("/advertise/status")
	public ResponseEntity<List<AdvStatusEntity>> getAllAdvertiseStatus(){
		List<AdvStatusEntity> advStatusEntities = masterDataService.getAllAdvertiseStatus();

		return new ResponseEntity<List<AdvStatusEntity>>(advStatusEntities, HttpStatus.OK);
	}

}
