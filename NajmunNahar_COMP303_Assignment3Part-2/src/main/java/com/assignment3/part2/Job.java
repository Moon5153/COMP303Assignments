package com.assignment3.part2;

public class Job {
	private int jobId;
	private String jobType;
	private String description;
	private String qualification;
	private double salary;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(int jobId, String jobType, String description, String qualification, double salary) {
		super();
		this.jobId = jobId;
		this.jobType = jobType;
		this.description = description;
		this.qualification = qualification;
		this.salary = salary;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
