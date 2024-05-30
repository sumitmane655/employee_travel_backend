package com.employeeTravel.main.repository;

import com.employeeTravel.main.domain.EmployeeDetails;

public interface EmployeeDetailsRepositoryInterface {
	public EmployeeDetails showEmployeeDetails(int loginId);
	public EmployeeDetails getEmployeeDetails(int requestId);
	
}
