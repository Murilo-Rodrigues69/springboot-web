package com.ceramicamaster.aprender.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ceramicamaster.aprender.entities.Category;
import com.ceramicamaster.aprender.entities.Product;

public  interface ProductRepository extends JpaRepository<Product, Long> {


	}
	
	
	


