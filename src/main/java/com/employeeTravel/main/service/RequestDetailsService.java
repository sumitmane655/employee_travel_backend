package com.employeeTravel.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeTravel.main.domain.RequestDetails;
import com.employeeTravel.main.repository.RequestDetailsRepository;
import com.employeeTravel.main.repository.RequestDetailsRepositoryInterface;
@Service
public class RequestDetailsService implements RequestDetailsServiceInterface {

	@Autowired
	RequestDetailsRepositoryInterface requestDetailsRepositoryInterface;
	
	@Override
	public List<RequestDetails> viewAllRequest(int employeeId) {
		return requestDetailsRepositoryInterface.viewAllRequest( employeeId);
	}

	@Override
	public boolean addRequest(RequestDetails requestDetails) {
		return requestDetailsRepositoryInterface.addRequest(requestDetails);
	}

	@Override
	public List<RequestDetails> viewManagerRequest(int employeeId) {
		return requestDetailsRepositoryInterface.viewManagerRequest(employeeId);
	}

	@Override
	public RequestDetails updateRequestStatus(RequestDetails requestDetails) {
		return requestDetailsRepositoryInterface.updateRequestStatus(requestDetails);
	}

//	
	
	@Override
	public List<RequestDetails> viewTravelAgentRequest() {
		return requestDetailsRepositoryInterface.viewTravelAgentRequest();
	}
	
	@Override
	public boolean validateSlab(int requestId) {
		
		return requestDetailsRepositoryInterface.validateSlab( requestId);
	}

	@Override
	public List<RequestDetails> viewTravelAgentApprovedRequest() {
		return requestDetailsRepositoryInterface.viewTravelAgentApprovedRequest();
	}

	@Override
	public List<RequestDetails> viewDirectorRequest() {
		return requestDetailsRepositoryInterface.viewDirectorRequest();
	}

	@Override
	public List<RequestDetails> viewDirectorApprovedRequest() {
		return requestDetailsRepositoryInterface.viewDirectorApprovedRequest();
	}

	@Override
	public List<RequestDetails> viewManagerAddRequest() {
		return requestDetailsRepositoryInterface.viewManagerAddRequest();
	}

	@Override
	public RequestDetails getEmail(int requestId) {
		return null;
	}
	


}
