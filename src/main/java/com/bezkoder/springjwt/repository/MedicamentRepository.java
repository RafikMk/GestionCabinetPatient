package com.bezkoder.springjwt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Medicament;

@Repository

public interface MedicamentRepository  extends CrudRepository<Medicament, Integer> {
	}
