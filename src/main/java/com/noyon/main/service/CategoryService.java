package com.noyon.main.service;

import java.util.List;



import com.noyon.main.entity.Category;


public interface CategoryService {

	public boolean saveCategory(Category category);
	
	public List<Category> getAllCategory();
}
