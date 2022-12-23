package com.bezkoder.springjwt.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ordonnance {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id ;
	private String description ;
	@OneToMany
	private List<Medicament> Medicament ;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Medicament> getMedicament() {
		return Medicament;
	}
	public void setMedicament(List<Medicament> medicament) {
		Medicament = medicament;
	}
	public ordonnance(Integer id, String description, List<com.bezkoder.springjwt.models.Medicament> medicament) {
		super();
		Id = id;
		this.description = description;
		Medicament = medicament;
	}
	public ordonnance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
