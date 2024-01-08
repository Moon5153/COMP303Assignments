package com.assignment2;
/* Name: Najmun Nahar
 * Course: COMP-303
 * Assignment-2
 * 
 */
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Payment entity class - Model class
@Entity
@Table(name="policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="policyid")
	private int policyId;
	@Column(name="policyno")
	private int policyNo;
	@Column(name="effectivedate")
	private Date effectiveDate;
	@Column(name="expdate")
	private Date expDate;
	@Column(name="totalamount")
	private double totalAmount;
	@Column(name="status")
	private String status;
	
	public Policy() {

	}

	public Policy(int policyId,int policyNo, String effectiveDate, String expDate, double totalAmount, String status) {
		super();
		this.policyId=policyId;
		this.policyNo = policyNo;
		this.totalAmount = totalAmount;
		this.status = status;
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.effectiveDate = simpleDateFormat.parse(effectiveDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.expDate = simpleDateFormat.parse(expDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}

	public String getEffectiveDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(this.effectiveDate);
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExpDate() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(this.expDate);
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		if(effectiveDate.getTime() >= expDate.getTime())
		{
			return status="Expired";
		}
		else
		{
			return status="Active";
		}
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public Date getNonFormattedEffectiveDate() {
		//return today's Date
		return effectiveDate=new Date();
	}
	
	public Date getNonFormattedExpDate() {
		return expDate;
	}
	
	
}
