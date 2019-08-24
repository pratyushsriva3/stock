package com.example.StockMarketCharting.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "User")

public class User {

	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public User( String username, String password, String usertype, String email, int mobilenumber,
			String confirmed) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.confirmed = confirmed;
	}


	public User() {
		// TODO Auto-generated constructor stub
	}


	@Column(name = "Username")
	@NotNull(message = "Enter Required Value")
	private String username;
	

	@Column(name = "Password")
	@NotNull(message = "Enter Required Value")
	private String password;
	
	
	@Column(name = "Usertype")

	private String usertype;
	
    
	@Column(name = "Email")
	@NotNull(message = "Enter Required Value")
	private String email;
	

	@Column(name = "Mobile_Number")
	@NotNull(message = "Enter Required Value")
	private int mobilenumber;
	

	@Column(name = "Confirmed")

	private String confirmed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	
	
}
