package com.bezkoder.springjwt.models;

import java.sql.Date;

public class Experience {
private Date date ;
private double lat ;
private double lang ;
private Doctor doctor ;
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public double getLat() {
	return lat;
}
public void setLat(double lat) {
	this.lat = lat;
}
public double getLang() {
	return lang;
}
public void setLang(double lang) {
	this.lang = lang;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
public Experience(Date date, double lat, double lang, Doctor doctor) {
	super();
	this.date = date;
	this.lat = lat;
	this.lang = lang;
	this.doctor = doctor;
}
public Experience() {
	super();
	// TODO Auto-generated constructor stub
}


}
