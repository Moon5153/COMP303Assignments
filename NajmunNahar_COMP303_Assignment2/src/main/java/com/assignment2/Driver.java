package com.assignment2;

/* Name: Najmun Nahar
 * Course: COMP-303
 * Assignment-2
 * 
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Driver entity class - Model class
@Entity
@Table(name="driver")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="driverid")
	private int driverId;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="dateofbirth")
	private String dateOfBirth;
	@Column(name="address")
	private String address;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Column(name="email", unique=true)
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="licenseno")
	private String licenseNo;
	@Column(name="licensestate")
	private String licenseState;
	@Column(name="policyid")
	private int policyId;
	
	public Driver() {

	}

	public Driver(String firstName, String lastName, String dateOfBirth, String address,
			String phoneNumber, String email, String password, String licenseNo, String licenseState,int policyId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.licenseNo = licenseNo;
		this.licenseState = licenseState;
		this.policyId=policyId;
	}
	
	//constructor for updating profile
	public Driver(int driverId,String firstName, String lastName, String dateOfBirth, String address,
			String phoneNumber, String email, String password, String licenseNo, String licenseState) {
		super();
		this.driverId=driverId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.licenseNo = licenseNo;
		this.licenseState = licenseState;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseState() {
		return licenseState;
	}

	public void setLicenseState(String licenseState) {
		this.licenseState = licenseState;
	}


	

}
