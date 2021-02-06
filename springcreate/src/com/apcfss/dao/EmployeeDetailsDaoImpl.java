package com.apcfss.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apcfss.model.EmployeeDetails;

@Repository("employeedao")
public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public boolean createEmployee(EmployeeDetails emp) {
		String sql="insert into springemployee(id,name,salary,designation) values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"','"+emp.getDesignation()+"')";
		int i=jdbcTemplate.update(sql);
	//	jdbcTemplate.
		if(i>0){
			System.out.println("-----------inserted successfully-------");
			return true;
					
		}
		return false;

	}
}
