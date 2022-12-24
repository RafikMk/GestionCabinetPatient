package com.bezkoder.springjwt.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Doctor;
import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.payload.request.SignupRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.DoctorRepository;
import com.bezkoder.springjwt.repository.RoleRepository;
import com.bezkoder.springjwt.repository.UserRepository;
import com.bezkoder.springjwt.security.jwt.JwtUtils;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/Api")
public class DoctorController {
	  @Autowired
	  AuthenticationManager authenticationManager;

	  @Autowired
	  UserRepository userRepository;

	  @Autowired
	  RoleRepository roleRepository;

	  @Autowired
	  PasswordEncoder encoder;

	  @Autowired
	  JwtUtils jwtUtils;

	  @Autowired
	  AuthController AuthController;
	@Autowired
	private DoctorRepository  DoctorRepository ;
	@RequestMapping(method = RequestMethod.GET , value="/Doctors")
	public List<Doctor> getAllDoctor() {
		List<Doctor> dossiersinistre = new ArrayList<>();
		DoctorRepository.findAll()
		.forEach(dossiersinistre::add);
		System.out.println(dossiersinistre) ;
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/Doctor")
	public ResponseEntity<?> addDoctor(@RequestBody Doctor Doctor) {
		   if (DoctorRepository.existsByCin(Doctor.getCin())) {
			      return ResponseEntity
			          .badRequest()
			          .body(new MessageResponse("Error: Doctor is already Exist!"));
			    }
	
		   Doctor d =	DoctorRepository.save(Doctor)	;	

SignupRequest SignupRequest  = new SignupRequest() ;
SignupRequest.setEmail(Doctor.getEmail());
SignupRequest.setPassword("654321");
SignupRequest.setRole("medcin");
SignupRequest.setUsername(Doctor.getUsername());
AuthController.registerUser2(SignupRequest,d,null) ;
		return ResponseEntity.ok()
				.body(new MessageResponse("Doctor ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/Doctor/{id}")
	public void deleteDoctor(@PathVariable Integer id) {
		DoctorRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/Doctor/{id}")
	public void updateDoctor(@PathVariable Integer id,@RequestBody  Doctor Doctor) {
		DoctorRepository.save(Doctor) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/Doctor/{id}")
	public Optional<Doctor> getDoctor(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		System.out.println(DoctorRepository.findById(id).get()) ;
		return DoctorRepository.findById(id);
	}
	


}
