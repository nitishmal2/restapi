package com.example.restexample.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
    private String lastname;
	@Column(name="email_id",nullable=false, unique=true)
    
    private String email;
    
    public Long getId() {
    	return id;
    }
    public String getFirstName() {
    	return firstname;
    }
    public String getLastName() {
    	return lastname;
    }
    public String getEmail() {
    	return email;
    }
    public void setId(Long id) {
    	this.id=id;
    }
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(Long id,String firstname,String lastname,String email) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}
	

}
