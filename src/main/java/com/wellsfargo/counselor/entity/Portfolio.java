package com.wellsfargo.counselor.entity;

import java.time.LocalDate;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Portfolio {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long portfolioId;
	
	@Column(nullable=false)
	private LocalDate today=LocalDate.now();
	
	@OneToOne
	@JoinColumn(name="ClientID",nullable=false)
	private Client client;
	
	@Column(nullable=false)
	private String name;
	
	
	public Portfolio(Client client,String name) {
		this.client=client;
		this.name=name;
		
	}
	protected Portfolio() {}
	
	public long getportfolioId() {
		return portfolioId;
	}
	
	public Client getclient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client=client;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	
	
}