package com.ceramicamaster.aprender.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ceramicamaster.aprender.entities.Order;

public  interface OrderRepository extends JpaRepository<Order, Long> {


	}
	
	
	


