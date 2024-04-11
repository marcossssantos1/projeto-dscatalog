package com.marcos.aula1.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcos.aula1.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResouce {
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L,"Telefone"));
		list.add(new Category(2L, "Celular"));
		
		return ResponseEntity.ok().body(list);
	}

}
