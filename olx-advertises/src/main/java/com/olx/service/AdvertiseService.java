package com.olx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.entity.AdvertiseEntity;
import com.olx.repository.AdvertiseRepo;

@Service
public interface AdvertiseService {
	
	
	public AdvertiseEntity createNewAdvertise(AdvertiseEntity advertiseEntity);

	public AdvertiseEntity updateAdvertise(int advertiseId);

	public List<AdvertiseEntity> getUserAdvertises();

	public AdvertiseEntity getUserAdvertiseById(int id);

	public boolean deleteUserAdretiseById(int id);

}
