package com.wellsfargo.counselor.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Securities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long SecurityId;
	
	@ManyToOne 
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private String category;
	
	@Column(nullable=false)
	private int quantity;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	private Date Purchasedate;
	
	@Column(nullable=false)
	private float purchaseprice;
	
	@OneToMany(mappedBy="security",cascade=CascadeType.ALL)
	private List<PortfolioItem> portfolioItem;
	
	public Securities(String name,String category,int quantity,Date purchasedate,float purchaseprice) {
		this.name=name;
		this.category=category;
		this.quantity=quantity;
		this.Purchasedate=purchasedate;
		this.purchaseprice=purchaseprice;
	}
	
	protected Securities() {}
	
	public long getSecurityId() {
		return SecurityId;
	}
	
	public String getname() {
		return name;
	}
	
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getcategory() {
		return category;

	}
	
	public void setcategory(String category) {
		this.category=category;
	}
	
	
	public int getquantity() {
		return quantity;

	}
	
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	
	
	public Date getdateofpurchase() {
		return Purchasedate;
	}
	
	public void setdateofpurchase(Date Purchasedate) {
		this.Purchasedate=Purchasedate;
	}
	
	
	public float getpurchaseprice() {
		return purchaseprice;
	}
	
	public void setphoneno(float purchaseprice) {
		this.purchaseprice=purchaseprice;
	}
	
	public List<PortfolioItem> getPortfolioItems() {
        return portfolioItem;
    }
 
    public void setPortfolioItems(List<PortfolioItem> portfolioItem) {
        this.portfolioItem = portfolioItem;
    }
	

}
	
