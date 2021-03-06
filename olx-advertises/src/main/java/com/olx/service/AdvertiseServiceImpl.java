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
	public List<AdvertiseEntity> getAdvertises() {
		return advertiseRepository.findAll();
	}

	@Override
	public AdvertiseEntity getAdvertiseById(int id) {
		return advertiseRepository.getById(id);
	}

	@Override
	public String deleteAdvertiseById(int id)
	{
		if(advertiseRepository.existsById(id))
			advertiseRepository.deleteById(id);
		else
			return "Data Not Present";
		if(advertiseRepository.existsById(id))
		{
			return "Not Deleted Successfully !!!";
		}
		return "Deleted Successfully !!!";
	}

}
