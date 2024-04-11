package com.marcos.aula1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.aula1.entities.Category;
import com.marcos.aula1.repositories.CategoryRepository;

@Service
public class CategoryService {
    
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
}
