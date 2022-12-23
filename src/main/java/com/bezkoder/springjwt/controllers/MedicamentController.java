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

import com.bezkoder.springjwt.models.Medicament;
import com.bezkoder.springjwt.payload.response.MessageResponse;
import com.bezkoder.springjwt.repository.MedicamentRepository;




@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class MedicamentController {
	@Autowired
	private MedicamentRepository  MedicamentRepository ;

	@RequestMapping(method = RequestMethod.GET , value="/Medicament")
	public List<Medicament> getAllPatient() {
		List<Medicament> dossiersinistre = new ArrayList<>();
		MedicamentRepository.findAll()
		.forEach(dossiersinistre::add);
		return dossiersinistre;
	}
	@RequestMapping(method = RequestMethod.POST , value="/Medicament")
	public ResponseEntity<?> addPatient(@RequestBody Medicament Medicament) {
	//	Optional<Medicament> c = contratRepository.findByNumPatient(id) ;
		// if (contratRepository.existsByNumPatient(id) == true)	{return  ResponseEntity.ok(c);} 
		MedicamentRepository.save(Medicament)	;	

		return ResponseEntity.badRequest()
				.body(new MessageResponse("Medicament ajouté !")); 
			}
	@RequestMapping(method = RequestMethod.DELETE , value="/Medicament/{id}")
	public void deletePatient(@PathVariable Integer id) {
		MedicamentRepository.deleteById(id);		
	}
	@RequestMapping(method = RequestMethod.PUT , value="/Medicament/{id}")
	public void updatePatient(@PathVariable Integer id,@RequestBody  Medicament Medicament) {
		MedicamentRepository.save(Medicament) ;
	}
	@RequestMapping(method = RequestMethod.GET , value="/Medicament/{id}")
	public Optional<Medicament> getPatient(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return MedicamentRepository.findById(id);
	}
}
