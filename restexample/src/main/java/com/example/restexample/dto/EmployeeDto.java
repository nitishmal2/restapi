package com.example.restexample.dto;


public class EmployeeDto {
	private Long id;
	private String firstname;
	private String lastname;
	private String email;

	public EmployeeDto(Long id,String firstname, String lastname, String email) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}

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
	public void SetFirstName(String firstname) {
		this.firstname=firstname;
	}
    public void SetLirstName(String lastname) {
		this.lastname=lastname;
	}
    public void SetEmail(String email) {
	this.email=email;
   }
	

}
