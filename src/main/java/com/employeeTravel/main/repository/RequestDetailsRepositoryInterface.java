package com.employeeTravel.main.repository;

import java.util.List;

import com.employeeTravel.main.domain.EmployeeDetails;
import com.employeeTravel.main.domain.RequestDetails;

public interface RequestDetailsRepositoryInterface {
	public List<RequestDetails> viewAllRequest(int employeeId);
	public boolean addRequest(RequestDetails requestDetails);
	public RequestDetails updateRequestStatus(RequestDetails requestDetails);
	public List<RequestDetails> viewManagerRequest(int employeeId);
	public List<RequestDetails> viewTravelAgentRequest();
	public boolean validateSlab( int requestId);
	public List<RequestDetails> viewTravelAgentApprovedRequest();
	public List<RequestDetails> viewDirectorRequest();  
	public List<RequestDetails> viewDirectorApprovedRequest();
	public List<RequestDetails> viewManagerAddRequest();
	
}
