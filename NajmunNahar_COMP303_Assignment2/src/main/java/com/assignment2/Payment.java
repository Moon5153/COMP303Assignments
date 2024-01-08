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

//Payment entity class - Model class
@Entity
@Table(name="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="recieptid")
	private int recieptId;
	@Column(name="paymentdate")
	private String paymentDate;
	@Column(name="amount")
	private double amount;
	@Column(name="paymentmethod")
	private String paymentMethod;
	@Column(name="driverid")
	private int driverId;
	
	public Payment() {

	}

	public Payment(String paymentDate, double amount, String paymentMethod, int driverId) {
		super();
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.driverId = driverId;
	}

	public int getRecieptId() {
		return recieptId;
	}

	public void setRecieptId(int recieptId) {
		this.recieptId = recieptId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
	
}
