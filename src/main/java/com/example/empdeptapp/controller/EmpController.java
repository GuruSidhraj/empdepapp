package com.example.empdeptapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empdeptapp.entity.Emp;
import com.example.empdeptapp.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping
	public List<Emp> getAllEmployees(){
		
		return empService.getEmployees();
		
	}
	
	@PostMapping
	public Emp createEmp(@RequestBody Emp emp ) {
		return empService.createEmployee(emp);
	}
	
	@GetMapping("/dept/{deptId}")
	public List<Emp> getEmpByDept(@PathVariable Long deptId){
		return empService.getEmployeesByDept(deptId);
		
	}
}
