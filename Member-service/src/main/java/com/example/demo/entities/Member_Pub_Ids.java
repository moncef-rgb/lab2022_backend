package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Member_Pub_Ids implements Serializable {

	private Long publication_id;
	private Long auteur_id;
	public Long getPublication_id() {
		return publication_id;
	}
	public void setPublication_id(Long publication_id) {
		this.publication_id = publication_id;
	}
	public Long getAuteur_id() {
		return auteur_id;
	}
	public void setAuteur_id(Long auteur_id) {
		this.auteur_id = auteur_id;
	}
	
	public Member_Pub_Ids(Long publication_id, Long auteur_id) {
		super();
		this.publication_id = publication_id;
		this.auteur_id = auteur_id;
	}
	public Member_Pub_Ids() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
