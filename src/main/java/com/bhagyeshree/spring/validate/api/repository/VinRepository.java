package com.bhagyeshree.spring.validate.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhagyeshree.spring.validate.api.entity.Results;

@Repository
public interface VinRepository extends JpaRepository<Results, Long>{
	
	

}
