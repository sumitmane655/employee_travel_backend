package com.employeeTravel.main.repository;

import java.util.List;

import com.employeeTravel.main.domain.BookingDetails;


public interface BookingDetailsRepositoryInterface {
	public List<BookingDetails> viewBookingDetails();
	public boolean addBookingDetails(BookingDetails bookingDetails);
	public List<BookingDetails> viewBookingDetailsById(int requestId);
}
