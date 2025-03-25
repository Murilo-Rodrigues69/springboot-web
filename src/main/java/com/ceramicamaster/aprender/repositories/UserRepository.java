package com.ceramicamaster.aprender.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ceramicamaster.aprender.entities.User;

public  interface UserRepository extends JpaRepository<User, Long> {


	}
	
	
	


