package com.marcos.aula1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.aula1.dto.CategoryDTO;
import com.marcos.aula1.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResouce {
	
	@Autowired
	private CategoryService service;
	
	
	@GetMapping
	public ResponseEntity<List<CategoryDTO>> findAll(){
		List<CategoryDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
