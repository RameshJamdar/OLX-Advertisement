package com.olx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olx.entity.AdvertiseEntity;

@Repository
public interface AdvertiseRepo extends JpaRepository<AdvertiseEntity, Integer> {

	AdvertiseEntity save(int advertiseId);
	

}
