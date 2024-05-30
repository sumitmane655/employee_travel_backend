package com.employeeTravel.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeTravel.main.domain.EmployeeDetails;
import com.employeeTravel.main.repository.EmployeeDetailsRepositoryInterface;
@Service
public class EmployeeDetailsService  implements EmployeeDetailsServiceInterface{

	@Autowired
	EmployeeDetailsRepositoryInterface employeeDetailsRepositoryInterface;
	
	@Override
	public EmployeeDetails showEmployeeDetails(int loginId) {
		return employeeDetailsRepositoryInterface.showEmployeeDetails(loginId);
	}

	@Override
	public EmployeeDetails getEmployeeDetails(int requestId) {
		// TODO Auto-generated method stub
		return employeeDetailsRepositoryInterface.getEmployeeDetails(requestId);
	}

}
