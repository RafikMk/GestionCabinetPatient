package com.bezkoder.springjwt.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Doctor;
import com.bezkoder.springjwt.models.Patient;
import com.bezkoder.springjwt.models.Patient;
import com.bezkoder.springjwt.payload.request.SignupRequest;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.PatientRepository;
import com.bezkoder.springjwt.repository.PatientRepository;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class PatientController {
	@Autowired
	private PatientRepository  PatientRepository ;
	@Autowired
	private AuthController AuthController ;
	@RequestMapping(method = RequestMethod.GET , value="/Patient")
	public List<Patient> getAllPatient() {
		List<Patient> dossiersinistre = new ArrayList<>();
		PatientRepository.findAll()
		.forEach(dossiersinistre::add);
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/Patient")
	public ResponseEntity<?> addPatient(@RequestBody Patient Patient) {
	//	Optional<Patient> c = contratRepository.findByNumPatient(id) ;
		// if (contratRepository.existsByNumPatient(id) == true)	{return  ResponseEntity.ok(c);} 
		Patient p =		PatientRepository.save(Patient)	;	

SignupRequest SignupRequest  = new SignupRequest() ;
SignupRequest.setEmail(Patient.getEmail());
SignupRequest.setPassword("654321");
SignupRequest.setRole("medcin");
SignupRequest.setUsername(Patient.getUsername());
AuthController.registerUser2(SignupRequest,null,p) ;
		return ResponseEntity.badRequest()
				.body(new MessageResponse("Patient ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/Patient/{id}")
	public void deletePatient(@PathVariable Integer id) {
		PatientRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/Patient/{id}")
	public void updatePatient(@PathVariable Integer id,@RequestBody  Patient Patient) {
		PatientRepository.save(Patient) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/Patient/{id}")
	public Optional<Patient> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return PatientRepository.findById(id);
	}
}
