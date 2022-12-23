package com.bezkoder.springjwt.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Doctor;
import com.bezkoder.springjwt.models.User;

@Repository

public interface DoctorRepository  extends CrudRepository<Doctor, Integer> {



	boolean existsByCin(Integer cin);

	  Optional<User> findByUsername(String username);
	}
