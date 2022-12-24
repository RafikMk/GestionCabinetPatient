package com.bezkoder.springjwt.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class RendezVous {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id ;
	private double Poids ;
	private double Taille ;
	private String etat ;
	private Date dateRendezVous ;
	@OneToOne
	private ordonnance ordonnance ;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public double getPoids() {
		return Poids;
	}
	public void setPoids(double poids) {
		Poids = poids;
	}
	public double getTaille() {
		return Taille;
	}
	public void setTaille(double taille) {
		Taille = taille;
	}
	public Date getDateRendezVous() {
		return dateRendezVous;
	}
	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}
	public ordonnance getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(ordonnance ordonnance) {
		this.ordonnance = ordonnance;
	}
	public RendezVous(Integer id, double poids, double taille, Date dateRendezVous,
			com.bezkoder.springjwt.models.ordonnance ordonnance) {
		super();
		Id = id;
		Poids = poids;
		Taille = taille;
		this.dateRendezVous = dateRendezVous;
		this.ordonnance = ordonnance;
	}
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public RendezVous(Integer id, double poids, double taille, String etat, Date dateRendezVous,
			com.bezkoder.springjwt.models.ordonnance ordonnance) {
		super();
		Id = id;
		Poids = poids;
		Taille = taille;
		this.etat = etat;
		this.dateRendezVous = dateRendezVous;
		this.ordonnance = ordonnance;
	}
	
	
}
