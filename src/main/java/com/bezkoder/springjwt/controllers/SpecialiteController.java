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

import com.bezkoder.springjwt.models.Specialite;
import com.bezkoder.springjwt.models.Specialite;
import com.bezkoder.springjwt.models.Specialite;
import com.bezkoder.springjwt.models.Specialite;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.SpecialiteRepository;
import com.bezkoder.springjwt.repository.SpecialiteRepository;
import com.bezkoder.springjwt.repository.SpecialiteRepository;
import com.bezkoder.springjwt.repository.SpecialiteRepository;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class SpecialiteController {
	@Autowired
	private SpecialiteRepository  SpecialiteRepository ;

	@RequestMapping(method = RequestMethod.GET , value="/Specialite")
	public List<Specialite> getAllPatient() {
		List<Specialite> dossiersinistre = new ArrayList<>();
		SpecialiteRepository.findAll()
		.forEach(dossiersinistre::add);
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/Specialite")
	public ResponseEntity<?> addPatient(@RequestBody Specialite Specialite) {
	//	Optional<Specialite> c = contratRepository.findByNumPatient(id) ;
		// if (contratRepository.existsByNumPatient(id) == true)	{return  ResponseEntity.ok(c);} 
		SpecialiteRepository.save(Specialite)	;	

		return ResponseEntity.badRequest()
				.body(new MessageResponse("Specialite ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/Specialite/{id}")
	public void deletePatient(@PathVariable Integer id) {
		SpecialiteRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/Specialite/{id}")
	public void updatePatient(@PathVariable Integer id,@RequestBody  Specialite Specialite) {
		SpecialiteRepository.save(Specialite) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/Specialite/{id}")
	public Optional<Specialite> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return SpecialiteRepository.findById(id);
	}
}
