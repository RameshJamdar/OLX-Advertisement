package com.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.entity.AdvertiseEntity;
import com.olx.repository.AdvertiseRepo;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {
    
	@Autowired
	AdvertiseRepo advertiseRepository;
	
	
	@Override
	public AdvertiseEntity createNewAdvertise(AdvertiseEntity advertiseEntity) {
	  return advertiseRepository.save(advertiseEntity);
	}

	@Override
	public AdvertiseEntity updateAdvertise(int advertiseId) {
		 return advertiseRepository.save(advertiseId);
	}

	@Override
	public List<AdvertiseEntity> getUserAdvertises() {
		return advertiseRepository.findAll();
	}

	@Override
	public AdvertiseEntity getUserAdvertiseById(int id) {
		return advertiseRepository.getById(id);
	}

	@Override
	public boolean deleteUserAdretiseById(int id) {
		Optional<AdvertiseEntity> optionalAdvertiseEntity = advertiseRepository.findById(id);
		if(optionalAdvertiseEntity.isPresent()) {
			advertiseRepository.deleteById(id);
			return true;
			}else
		return false;
	}

}
