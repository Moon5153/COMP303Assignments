package com.assignment3.part1;
/*
 * Author: Najmun Nahar
 * ID: 301160081
 * COMP-303
 * Assignment-3
 */
import org.springframework.stereotype.Component;

@Component
public class Candidate {

	private int candidateId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String phone;
	private String email;
	
	
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int candidateId, String firstName, String lastName, String address, String city, String phone,
			String email) {
		super();
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
