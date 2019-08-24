package com.example.StockMarketCharting.Models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;





@Entity
@Table(name="sectors")
public class Sector {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sector_id")
	private int id;
	
	@Column(name="sector_name")
	 private String name;
	
	@Column(name="sector_brief")
	 private String brief;

	
	  public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrief() {
		return brief;
	}


	public void setBrief(String brief) {
		this.brief = brief;
	}


	public List<Company> getCompanies() {
		return companies;
	}


	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}


	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="sector") 
	  @Column(nullable = true)
	  @JsonManagedReference
	  private List<Company> companies;
	/*@Override
	public String toString() {
		return "Sector [id=" + id + ", name=" + name + ", brief=" + brief + "]";
	}*/
	 
}
