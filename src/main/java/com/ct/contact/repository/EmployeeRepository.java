package com.ct.contact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ct.contact.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	//List<Employee> findByAdrPincode(String name);
}

