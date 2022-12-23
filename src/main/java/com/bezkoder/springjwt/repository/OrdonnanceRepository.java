package com.bezkoder.springjwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.ordonnance;

@Repository

public interface OrdonnanceRepository  extends CrudRepository<ordonnance, Integer> {
	}
