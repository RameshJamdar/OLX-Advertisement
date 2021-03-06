package com.olx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.entity.AdvStatusEntity;
import com.olx.entity.CategoryEntity;
import com.olx.repository.CategoryRepo;
import com.olx.repository.StatusRepository;

@Service
public class MasterServiceImpl implements MasterService {

	
	@Autowired
	CategoryRepo categoryRepository;
	
	@Autowired
	StatusRepository statusRepository;
	
	@Override
	public List<CategoryEntity> getAllCategories() {
		List<CategoryEntity> categoryEntities = categoryRepository.findAll();
		return categoryEntities;
	}

	@Override
	public List<AdvStatusEntity> getAllAdvertiseStatus() {
		List<AdvStatusEntity> advStatusEntities = statusRepository.findAll();
		return advStatusEntities;
	}

}
