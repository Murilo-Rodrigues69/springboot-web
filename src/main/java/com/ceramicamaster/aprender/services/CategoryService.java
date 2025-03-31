package com.ceramicamaster.aprender.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ceramicamaster.aprender.entities.Category;
import com.ceramicamaster.aprender.repositories.CategoryRepository;

@Component
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {
	Optional<Category> obj = repository.findById(id);
	return obj.get();
	}
}
