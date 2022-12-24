package com.bezkoder.springjwt.models;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
@Entity
public class Doctor {


	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer cin;
	private String username ;

	  @OneToOne
	  private Specialite Specialite ;
private Integer latitude ;
private Integer longitude ;
private String email ;
private String tel ;
@NotBlank
@Size(max = 120)
private String password;
@Column

@ElementCollection(targetClass=String.class)
private List<String> Diplomes ;
@Column
@ElementCollection(targetClass=String.class)
private List<String>  Experience ;
private Time Horaire ;
public Integer getId() {
	return id;
}
public void setId(Long id) {
	id = id;
}
public Integer getCin() {
	return cin;
}
public void setCin(Integer cin) {
	this.cin = cin;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public Specialite getSpecialite() {
	return Specialite;
}
public void setSpecialite(Specialite specialite) {
	Specialite = specialite;
}
public Integer getLatitude() {
	return latitude;
}
public void setLatitude(Integer latitude) {
	this.latitude = latitude;
}
public Integer getLongitude() {
	return longitude;
}
public void setLongitude(Integer longitude) {
	this.longitude = longitude;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public List<String> getDiplomes() {
	return Diplomes;
}
public void setDiplomes(List<String> diplomes) {
	Diplomes = diplomes;
}
public List<String> getExperience() {
	return Experience;
}
public void setExperience(List<String> experience) {
	Experience = experience;
}
public Time getHoraire() {
	return Horaire;
}
public void setHoraire(Time horaire) {
	Horaire = horaire;
}
public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}
public Doctor(Long id, Integer cin, String username,
		com.bezkoder.springjwt.models.Specialite specialite, Integer latitude, Integer longitude, String email,
		String tel, @NotBlank @Size(max = 120) String password, List<String> diplomes, List<String> experience,
		Time horaire) {
	super();
	id = id;
	this.cin = cin;
	this.username = username;
	Specialite = specialite;
	this.latitude = latitude;
	this.longitude = longitude;
	this.email = email;
	this.tel = tel;
	this.password = password;
	Diplomes = diplomes;
	Experience = experience;
	Horaire = horaire;
}
public Doctor(String username, String email, @NotBlank @Size(max = 120) String password) {
	super();
	this.username = username;
	this.email = email;
	this.password = password;
}


}
