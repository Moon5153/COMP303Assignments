package com.assignment2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{
	public Policy findById(int policyId);

}
