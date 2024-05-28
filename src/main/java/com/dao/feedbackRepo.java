package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.feedback;

public interface feedbackRepo  extends JpaRepository<feedback,Long>{

}
