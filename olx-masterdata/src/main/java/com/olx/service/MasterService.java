package com.olx.service;

import java.util.List;

import com.olx.entity.AdvStatusEntity;
import com.olx.entity.CategoryEntity;

public interface MasterService {

	public List<CategoryEntity> getAllCategories();
	
	public List<AdvStatusEntity> getAllAdvertiseStatus();

	/*
	 * public String getCategoryName(int categoryId);
	 * 
	 * public String getStatusById(int statusId);
	 * 
	 * CategoryEntity saveCategoryEntity(CategoryEntity categoryEntity);
	 * 
	 * CategoryEntity updateCategoryEntity(CategoryEntity CategoryEntity);
	 */
}
