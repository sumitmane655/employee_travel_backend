package com.employeeTravel.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.employeeTravel.main.domain.BookingDetails;
import com.employeeTravel.main.domain.RequestDetails;
@Repository
public class BookingDetailsRepository implements BookingDetailsRepositoryInterface {

	private final String ADD_NEW_BOOKING = "insert into booking_details values (booking_details_sequence.NEXTVAL,?, ?, ?, ?,?,?,?)";
	private final String VIEW_All_BOOKING = "SELECT * FROM BOOKING_DETAILS";
	private final String VIEW_BOOKING_DETAILS_BY_ID= "select * from booking_details where request_id=?";
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<BookingDetails> viewBookingDetails() {
			return jdbcTemplate.query(VIEW_All_BOOKING, new RequestRowMap());
		}

	
	
	@Override
	public boolean addBookingDetails(BookingDetails bookingDetails) {
		Object[] params = { bookingDetails.getRequestDetails().getRequestId(),
				bookingDetails.getTravelCost(), bookingDetails.getHotelName(),
				bookingDetails.getCheckIn(), bookingDetails.getCheckOut(),
				bookingDetails.getDepartureTime(), bookingDetails.getArrivalTime()	};
		int result = jdbcTemplate.update(ADD_NEW_BOOKING, params);
		if (result > 0)
			return true;
		return false;
	}
	
	@Override
	public List<BookingDetails> viewBookingDetailsById(int requestId) {
		return jdbcTemplate.query(VIEW_BOOKING_DETAILS_BY_ID, new RequestRowMap(), requestId);
	}	

	
	
	public class RequestRowMap implements RowMapper<BookingDetails> {

		@Override
		public BookingDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			int bookingId = rs.getInt("booking_id");
		    double  travelCost=rs.getInt("travel_cost");
			String hotel_Name=rs.getString("hotel_name");
			String checkIn = rs.getString("check_in");
			String checkOut = rs.getString("check_out");
			String departureTime = rs.getString("departure_time");
			String arrival_time = rs.getString("arrival_time");
			
			RequestDetails requestDetails = new RequestDetails();
			requestDetails.setRequestId(rs.getInt("request_id"));
			
			BookingDetails bookingDetails= new BookingDetails(bookingId, travelCost, hotel_Name, checkIn, checkOut, departureTime, arrival_time, requestDetails); 
			return bookingDetails;
		}

	}	

}
