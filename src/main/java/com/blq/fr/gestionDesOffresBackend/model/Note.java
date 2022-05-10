package com.blq.fr.gestionDesOffresBackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "note")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private Long nbLikes;
	public Note() {
		super();
	}
	public Note(Long id, Long nbLikes) {
		super();
		this.id = id;
		this.nbLikes = nbLikes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNbLikes() {
		return nbLikes;
	}
	public void setNbLikes(Long nbLikes) {
		this.nbLikes = nbLikes;
	}
	
	
	
	



	
}
