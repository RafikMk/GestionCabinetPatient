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

import com.bezkoder.springjwt.models.RendezVous;
import com.bezkoder.springjwt.models.RendezVous;
import com.bezkoder.springjwt.models.RendezVous;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.RendezVousRepository;
import com.bezkoder.springjwt.repository.RendezVousRepository;
import com.bezkoder.springjwt.repository.RendezVousRepository;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class RendezVousController {
	@Autowired
	private RendezVousRepository  RendezVousRepository ;

	@RequestMapping(method = RequestMethod.GET , value="/RendezVous")
	public List<RendezVous> getAllPatient() {
		List<RendezVous> dossiersinistre = new ArrayList<>();
		RendezVousRepository.findAll()
		.forEach(dossiersinistre::add);
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/RendezVous")
	public ResponseEntity<?> addPatient(@RequestBody RendezVous RendezVous) {
	//	Optional<RendezVous> c = contratRepository.findByNumPatient(id) ;
		// if (contratRepository.existsByNumPatient(id) == true)	{return  ResponseEntity.ok(c);} 
		RendezVousRepository.save(RendezVous)	;	

		return ResponseEntity.badRequest()
				.body(new MessageResponse("RendezVous ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/RendezVous/{id}")
	public void deletePatient(@PathVariable Integer id) {
		RendezVousRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/RendezVous/{id}")
	public void updatePatient(@PathVariable Integer id,@RequestBody  RendezVous RendezVous) {
		RendezVousRepository.save(RendezVous) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/RendezVous/{id}")
	public Optional<RendezVous> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return RendezVousRepository.findById(id);
	}
}
