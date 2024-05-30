package com.employeeTravel.main.service;

import java.util.List;

import com.employeeTravel.main.domain.RequestDetails;

public interface RequestDetailsServiceInterface {
	public List<RequestDetails> viewAllRequest(int employeeId);
	public boolean addRequest(RequestDetails requestDetails);
	public List<RequestDetails> viewManagerRequest(int employeeId);
	public RequestDetails updateRequestStatus(RequestDetails requestDetails);
	public List<RequestDetails> viewTravelAgentRequest();
	public boolean validateSlab(int requestId);
	public List<RequestDetails> viewTravelAgentApprovedRequest();
	public List<RequestDetails> viewDirectorRequest();  
	public List<RequestDetails> viewDirectorApprovedRequest();
	public List<RequestDetails> viewManagerAddRequest();
	public RequestDetails getEmail(int requestId);
	
	
}
