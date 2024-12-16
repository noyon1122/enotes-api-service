package com.noyon.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noyon.main.entity.Category;
import com.noyon.main.service.CategoryService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

	@Autowired 
	private CategoryService categoryService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveCategory(@RequestBody Category category)
	{
	  boolean saveCategory=	categoryService.saveCategory(category);
	  
	  if(saveCategory)
	  {
		  return new ResponseEntity<String> ("Category Saved Successfully!!",HttpStatus.CREATED);
	  }
	  else {
		  return new ResponseEntity<String> ("Category Not Saved Successfully!!",HttpStatus.INTERNAL_SERVER_ERROR);
	  }
		
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Category>> getAllCategory()
	{
		List<Category> allCategory=categoryService.getAllCategory();
		if(CollectionUtils.isEmpty(allCategory))
		{
			return ResponseEntity.noContent().build();
		}
		else {
			return new ResponseEntity<> (allCategory,HttpStatus.OK);
		}
	}
	
}
