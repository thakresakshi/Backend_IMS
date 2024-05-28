package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.admission;


public interface admissionRepo extends JpaRepository<admission,Long> {

	
}
