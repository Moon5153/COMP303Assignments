package com.assignment2;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DriverRepository extends JpaRepository<Driver, Integer>{
		public Driver findByEmail(String email);

}
