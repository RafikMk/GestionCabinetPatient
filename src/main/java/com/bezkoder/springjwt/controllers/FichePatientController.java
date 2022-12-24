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
import com.bezkoder.springjwt.models.RendezVous;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.FichePatientRepository;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class FichePatientController {
	@Autowired
	private FichePatientRepository  FichePatientRepository ;

	@RequestMapping(method = RequestMethod.GET , value="/FichePatient/{id}")
	public List<RendezVous> getAllPatient(@PathVariable Integer id) {
		List<FichePatient> dossiersinistre = new ArrayList<>();
		List<FichePatient> f = new ArrayList<>();
		List<RendezVous> r = new ArrayList<>();
		FichePatientRepository.findAll() 
		.forEach(dossiersinistre::add);
		for (FichePatient FichePatient : dossiersinistre) {
			System.out.println(FichePatient.getPatient().getId()) ;
if (FichePatient.getPatient().getId() == id)
	{
	System.out.println("fffff"+FichePatient.getPatient().getId()) ;
	FichePatient.getRendezVous().forEach(r::add);

	f.add(FichePatient) ;
	}
	}
		
		return r;
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
	@RequestMapping(method = RequestMethod.GET , value="/fichePatient/{id}")
	public Optional<FichePatient> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return FichePatientRepository.findById(id);
	}
	
}
