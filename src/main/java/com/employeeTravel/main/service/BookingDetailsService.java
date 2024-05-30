package com.employeeTravel.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeTravel.main.domain.BookingDetails;
import com.employeeTravel.main.repository.BookingDetailsRepositoryInterface;
import com.employeeTravel.main.repository.RequestDetailsRepositoryInterface;
@Service
public class BookingDetailsService implements BookingDetailsServiceInterface {
	
	@Autowired
	BookingDetailsRepositoryInterface bookingDetailsRepositoryInterface;
	
	@Override
	public List<BookingDetails> viewBookingDetails() {
		return bookingDetailsRepositoryInterface.viewBookingDetails();
	}

	@Override
	public boolean addBookingDetails(BookingDetails bookingDetails) {
		return bookingDetailsRepositoryInterface.addBookingDetails(bookingDetails);
	}
	@Override
	public List<BookingDetails> viewBookingDetailsById(int requestId) {
		return bookingDetailsRepositoryInterface.viewBookingDetailsById(requestId);
	}
	
	

}
