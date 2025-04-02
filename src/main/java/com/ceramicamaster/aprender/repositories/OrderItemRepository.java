package com.ceramicamaster.aprender.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ceramicamaster.aprender.entities.OrderItem;
import com.ceramicamaster.aprender.entities.pk.OrderItemPK;



public  interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


	}
	
	
	


