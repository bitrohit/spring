package com.Tollgate.Rohit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tollgate.Rohit.model.Token;

@Repository
public interface InfoRepo extends JpaRepository<Token, Integer>{
	
}
