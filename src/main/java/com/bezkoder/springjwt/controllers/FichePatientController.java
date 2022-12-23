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

import com.bezkoder.springjwt.models.FichePatient;

import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.FichePatientRepository;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class FichePatientController {
	@Autowired
	private FichePatientRepository  FichePatientRepository ;

	@RequestMapping(method = RequestMethod.GET , value="/FichePatient")
	public List<FichePatient> getAllPatient() {
		List<FichePatient> dossiersinistre = new ArrayList<>();
		FichePatientRepository.findAll()
		.forEach(dossiersinistre::add);
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/FichePatient")
	public ResponseEntity<?> addPatient(@RequestBody FichePatient FichePatient) {
	//	Optional<FichePatient> c = contratRepository.findByNumPatient(id) ;
		// if (contratRepository.existsByNumPatient(id) == true)	{return  ResponseEntity.ok(c);} 
		FichePatientRepository.save(FichePatient)	;	

		return ResponseEntity.badRequest()
				.body(new MessageResponse("FichePatient ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/FichePatient/{id}")
	public void deletePatient(@PathVariable Integer id) {
		FichePatientRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/FichePatient/{id}")
	public void updatePatient(@PathVariable Integer id,@RequestBody  FichePatient FichePatient) {
		FichePatientRepository.save(FichePatient) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/FichePatient/{id}")
	public Optional<FichePatient> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return FichePatientRepository.findById(id);
	}
}
