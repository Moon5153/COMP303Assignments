package com.assignment3.part1;
/*
 * Author: Najmun Nahar
 * ID: 301160081
 * COMP-303
 * Assignment-3
 */
import org.springframework.stereotype.Component;

@Component
public class Organization {
	private int orgId;
	private String orgName;
	private String address;
	private String phone;
	private String website;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(int orgId, String orgName, String address, String phone, String website) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.address = address;
		this.phone = phone;
		this.website = website;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	

}
