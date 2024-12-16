package com.noyon.main.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.noyon.main.entity.Category;
import com.noyon.main.repository.CategoryRepo;
import com.noyon.main.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public boolean saveCategory(Category category) {
		// TODO Auto-generated method stub
		category.setDeleted(false);
		category.setCreatedBy(1);
		category.setCreateOn(new Date());
		Category saveCategory=categoryRepo.save(category);
		if(ObjectUtils.isEmpty(saveCategory))
		{
			return false;
		}
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		
		List<Category> categories=categoryRepo.findAll();
		return categories;
	}

}
