package com.apcfss.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.apcfss.model.EmployeeDetails;
import com.apcfss.model.Worker;
import com.apcfss.service.EmployeeDetailsService;

@Controller
@RequestMapping("/employeedetails")
public class EmployeeDetailsController {
	@Autowired
	EmployeeDetailsService employeeservice;
	
	@RequestMapping(value="/create",method = RequestMethod.GET)
	ModelAndView create(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		 modelAndView.addObject("employeedetails",new EmployeeDetails());
	
		modelAndView.setViewName("emp");
		 return modelAndView;
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	ModelAndView save(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("employeedetails")EmployeeDetails emp)
	{
		System.out.println("id :"+ emp.getId());
		System.out.println("Name"+ emp.getName());

		System.out.println("salary"+ emp.getSalary());
		System.out.println("Designation :"+ emp.getDesignation());
		employeeservice.createEmployee(emp);
		
		
		return null;
		
		
		
	}
}
