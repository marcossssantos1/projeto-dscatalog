package com.marcos.aula1.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcos.aula1.dto.CategoryDTO;
import com.marcos.aula1.entities.Category;
import com.marcos.aula1.repositories.CategoryRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoryService {
    
	@Autowired
	private CategoryRepository repository;
	
	@Transactional
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}
	
}
