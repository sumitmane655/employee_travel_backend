package com.employeeTravel.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.employeeTravel.main.domain.EmployeeDetails;
import com.employeeTravel.main.domain.Login;

@Repository
public class EmployeeDetailsRepository implements EmployeeDetailsRepositoryInterface {

	private final static String SHOW_EMP_DETAILS = "SELECT * FROM EMPLOYEE_DETAILS where login_id=?";
	private final static String GET_EMPLOYEE_DETAILS="select * from employee_details where employee_id=(select employee_id from request_details where request_id=?)";
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public EmployeeDetails showEmployeeDetails(int loginId) {
		return jdbcTemplate.queryForObject(SHOW_EMP_DETAILS, new EmployeeDetailsRowMap(), loginId);
	}
	@Override
	public EmployeeDetails getEmployeeDetails(int requestId) {
		
		return jdbcTemplate.queryForObject(GET_EMPLOYEE_DETAILS, new EmployeeDetailsRowMap(),requestId);
	}
	

	public class EmployeeDetailsRowMap implements RowMapper<EmployeeDetails> {

		@Override
		public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
			int empId = rs.getInt("employee_id");
			String empName = rs.getString("employee_name");
			String gender = rs.getString("gender");
			LocalDate dob = rs.getDate("date_of_birth").toLocalDate();
			String state = rs.getString("state");
			String city = rs.getString("city");
			String country = rs.getString("country");
			String pincode = rs.getString("pincode");
			String email_id = rs.getString("email_id");
			String contact = rs.getString("contact_no");
			String designation = rs.getString("designation");
			int reportsTo = rs.getInt("reports_to");
			double salary = rs.getDouble("salary");
			int slabId = rs.getInt("slab_id");
			int loginId = rs.getInt("login_id");
			EmployeeDetails employeeDetails = new EmployeeDetails(empId, empName, gender, dob, city, state, country,
					rowNum, email_id, empId, designation, reportsTo, salary, loginId, slabId);

			return employeeDetails;
		}
	}


	

	
}
