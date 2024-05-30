package com.employeeTravel.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeeTravel.main.domain.EmployeeDetails;
import com.employeeTravel.main.domain.RequestDetails;
import com.employeeTravel.main.service.RequestDetailsService;

@CrossOrigin("*")
@RestController
@RequestMapping("requestdetailsapi")
public class RequestDetailsController {
	@Autowired
	private RequestDetailsService requestDetailsService;

	@RequestMapping(value = "requestdetails/{employeeId}", method = RequestMethod.GET)
	public List<RequestDetails> showEmp(@PathVariable int employeeId) {		
		return requestDetailsService.viewAllRequest(employeeId);
	}
	
	@RequestMapping(value = "addrequestdetail", method = RequestMethod.POST)
	public boolean addRequest(@RequestBody RequestDetails requestDetails) {
		return requestDetailsService.addRequest(requestDetails);
	}

//	http://localhost:8080/requestdetailsapi/managerrequestdetails/{employeeId}
	@RequestMapping(value = "managerrequestdetails/{employeeId}", method = RequestMethod.GET)
	public List<RequestDetails> viewManagerRequest(@PathVariable int employeeId) {		
		return requestDetailsService.viewManagerRequest(employeeId);
	}

// Update Status by Manager:  http://localhost:8080/requestdetailsapi/updaterequeststatus	
	@RequestMapping(value = "updaterequeststatus", method = RequestMethod.PUT)
	public RequestDetails updateRequestStatus(@RequestBody RequestDetails requestDetails) {
		requestDetailsService.updateRequestStatus(requestDetails);
		return requestDetails;
	}
	

	@RequestMapping(value = "travelagentrequestdetails", method = RequestMethod.GET)
	public List<RequestDetails> viewTravelAgentRequest() {		
		return requestDetailsService.viewTravelAgentRequest();
	}
	
	// Validate Slab: http://localhost:8080/requestdetailsapi/validateslab/{requestId}
		@RequestMapping(value = "validateslab/{requestId}", method = RequestMethod.GET)
		public boolean viewTravelAgentRequest( @PathVariable int requestId) {		
			return requestDetailsService.validateSlab( requestId);
		}

		@RequestMapping(value = "travelagentapprovedrequest", method = RequestMethod.GET)
		public List<RequestDetails> viewTravelAgentApprovedRequest() {		
			return requestDetailsService.viewTravelAgentApprovedRequest();
		}
		
		@RequestMapping(value = "directorrequestdetails", method = RequestMethod.GET)
		public List<RequestDetails> viewDirectorRequest() {
			return requestDetailsService.viewDirectorRequest();
		}
		
		@RequestMapping(value = "directorapprovedrequest", method = RequestMethod.GET)
		public List<RequestDetails> viewDirectorApprovedRequest(){		
			return requestDetailsService.viewDirectorApprovedRequest();
		}
		
		//Manager Add Request:-  http://localhost:8080/requestdetailsapi/manageraddrequest
		@RequestMapping(value = "manageraddrequest", method = RequestMethod.GET)
		public List<RequestDetails> viewManagerAddRequest(){
			return requestDetailsService.viewManagerAddRequest();
		}
		@RequestMapping(value="getmail/{requestId}", method = RequestMethod.GET)
		public RequestDetails getEmail(@PathVariable int requestId) {
			return requestDetailsService.getEmail(requestId);
		}





}
