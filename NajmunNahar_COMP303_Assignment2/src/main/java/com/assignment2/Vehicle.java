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


@Entity
@Table(name="vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicleid")
	private int vehicleId;
	@Column(name="policyid")
	private int policyId;
	@Column(name="vinno")
	private String vinNo;
	@Column(name="year")
	private String year;
	@Column(name="make")
	private String make;
	@Column(name="model")
	private String model;
	@Column(name="mileage")
	private double mileage;
	
	public Vehicle() {

	}

	

	public Vehicle(int policyId, String vinNo, String year, String make, String model, double mileage) {
		super();
		this.policyId = policyId;
		this.vinNo = vinNo;
		this.year = year;
		this.make = make;
		this.model = model;
		this.mileage = mileage;
	}



	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	
	public String getVinNo() {
		return vinNo;
	}



	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}


	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	
	
	

}
