package com.apcfss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apcfss.dao.EmployeeDetailsDao;
import com.apcfss.model.EmployeeDetails;
@Service("employeeservice")
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService
{
	@Autowired
	EmployeeDetailsDao employeedao;
	
 public boolean createEmployee(EmployeeDetails emp) {
	
	 
	 
	 
	return employeedao.createEmployee(emp);
}
}
