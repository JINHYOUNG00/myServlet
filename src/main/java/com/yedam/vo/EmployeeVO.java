package com.yedam.vo;

import lombok.Data;

@Data
public class EmployeeVO {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String Email;
	private String jobId;
	
	
	
	public EmployeeVO(int employeeId, String firstName, String lastName, String email, String jobId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
		this.jobId = jobId;
	}



	public EmployeeVO() {
	}

	

}

