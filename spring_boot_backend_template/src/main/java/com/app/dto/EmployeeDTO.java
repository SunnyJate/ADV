package com.app.dto;

import java.time.LocalDate;

import javax.persistence.Column;

public class EmployeeDTO {
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;	
	private LocalDate joinDate;
	private double salary;
	
	private String location;
	
	private String department;

}
