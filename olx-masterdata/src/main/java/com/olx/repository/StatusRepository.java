package com.olx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olx.entity.AdvStatusEntity;

public interface StatusRepository extends JpaRepository<AdvStatusEntity, Integer> {

}