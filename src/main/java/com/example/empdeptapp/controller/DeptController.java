package com.example.empdeptapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DeptController {

	@Autowired
	private DeptSevice deptService;
	
	@GetMapping
	public List<Dept> getAllDepts(){
		
		deptService.getAllDepts();
	}
	
	@PostMapping
	public Dept createDept(@RequestBody Dept dept) {
		
		deptService.createDept(dept);
		
	}
	

}
