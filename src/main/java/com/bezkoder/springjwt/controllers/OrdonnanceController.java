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

import com.bezkoder.springjwt.models.ordonnance;
import com.bezkoder.springjwt.models.ordonnance;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.OrdonnanceRepository;
import com.bezkoder.springjwt.repository.OrdonnanceRepository;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class OrdonnanceController {
	@Autowired
	private OrdonnanceRepository  OrdonnanceRepository ;

	@RequestMapping(method = RequestMethod.GET , value="/ordonnance")
	public List<ordonnance> getAllPatient() {
		List<ordonnance> dossiersinistre = new ArrayList<>();
		OrdonnanceRepository.findAll()
		.forEach(dossiersinistre::add);
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/ordonnance")
	public ResponseEntity<?> addPatient(@RequestBody ordonnance ordonnance) {
	//	Optional<ordonnance> c = contratRepository.findByNumPatient(id) ;
		// if (contratRepository.existsByNumPatient(id) == true)	{return  ResponseEntity.ok(c);} 
		OrdonnanceRepository.save(ordonnance)	;	

		return ResponseEntity.badRequest()
				.body(new MessageResponse("ordonnance ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/ordonnance/{id}")
	public void deletePatient(@PathVariable Integer id) {
		OrdonnanceRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/ordonnance/{id}")
	public void updatePatient(@PathVariable Integer id,@RequestBody  ordonnance ordonnance) {
		OrdonnanceRepository.save(ordonnance) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/ordonnance/{id}")
	public Optional<ordonnance> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return OrdonnanceRepository.findById(id);
	}
}
