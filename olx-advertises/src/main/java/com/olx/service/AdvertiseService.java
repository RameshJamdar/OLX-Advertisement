package com.olx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.entity.AdvertiseEntity;
import com.olx.repository.AdvertiseRepo;

@Service
public interface AdvertiseService {
	
	
	public AdvertiseEntity createNewAdvertise(AdvertiseEntity advertiseEntity);

	public AdvertiseEntity updateAdvertise(int id);

	public List<AdvertiseEntity> getAdvertises();

	public AdvertiseEntity getAdvertiseById(int id);

	public String deleteAdvertiseById (int id);

}
