
INSERT INTO roles VALUES (1,'ROLE_MEDCIN') ;
INSERT INTO roles VALUES (2,'ROLE_PATIENT') ;
INSERT INTO roles VALUES (3,'ROLE_ADMIN') ;
INSERT INTO users (id,email,password,username) VALUES (1,'Azd9min@gmail.com','$2a$10$xtzKvf7YHdRguJlv0vTTVu5Yp2icp8ALlkxAobJ/u73ShYEPeq6Ke','admin') ;
INSERT INTO doctor(id,username) VALUES (1,"rafik") ;
INSERT INTO doctor(id,username) VALUES (2,"mahdi") ;
INSERT INTO patient(id,username) VALUES (1,"er") ;
INSERT INTO patient(id,username) VALUES (2,"sa") ;
INSERT INTO fiche_patient(doctor_id,patient_id) VALUES (1,1) ;
INSERT INTO fiche_patient(doctor_id,patient_id) VALUES (1,2) ;
INSERT INTO rendez_vous(id,poids,taille,date_rendez_vous,etat,ordonnance_id) VALUES (1,11,11,null,"eeee",null) ;
INSERT INTO rendez_vous(id,poids,taille,date_rendez_vous,etat,ordonnance_id) VALUES (2,22,22,null,"rrrr",null) ;
INSERT INTO fiche_patient_rendez_vous(fiche_patient_doctor_id,fiche_patient_patient_id,rendez_vous_id) VALUES (1,2,1) ;
INSERT INTO fiche_patient_rendez_vous(fiche_patient_doctor_id,fiche_patient_patient_id,rendez_vous_id) VALUES (1,2,2) ;

