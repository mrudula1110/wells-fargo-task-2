package com.wellsfargo.counselor.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ClientID;
	
	@ManyToOne 
	@JoinColumn(name="advisorID",nullable=false)
	private Advisor advisor;
	
	@Column(nullable=false)
	private String FirstName;
	
	@Column(nullable=false)
	private String LastName;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String phoneno;
	
	@Column(nullable=false)
	private String address;
	
	@OneToOne(mappedBy="client",cascade=CascadeType.ALL)
	private Portfolio portfolio;
	
	public Client(Advisor advisor,String FirstName,String LastName,String email,String phoneno,String address) {
		this.advisor=advisor;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.email=email;
		this.phoneno=phoneno;
		this.address=address;
	}
	
	protected Client() {}
	
	public long getClientId() {
		return ClientID;
	}
	
	public Advisor getadvisor() {
		return advisor;
	}
	
	public void setAdvisor(Advisor advisor) {
		this.advisor=advisor;
	}
	
	public String getFirstName() {
		return FirstName;

	}
	
	public void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}
	
	
	public String getLastName() {
		return LastName;

	}
	
	public void setLastName(String LastName) {
		this.LastName=LastName;
	}
	
	
	public String getemail() {
		return email;
	}
	
	public void setemail(String email) {
		this.email=email;
	}
	
	
	public String getphoneno() {
		return phoneno;
	}
	
	public void setphoneno(String phoneno) {
		this.phoneno=phoneno;
	}
	
	
	public String getaddress() {
		return address;

	}
	
	public void setaddress(String address) {
		this.address=address;
	}
	
	public Portfolio getportfolio() {
		return portfolio;
	}
	
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio=portfolio;
	}
	

}
	