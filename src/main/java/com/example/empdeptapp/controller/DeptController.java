package com.example.empdeptapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empdeptapp.entity.Dept;
import com.example.empdeptapp.service.DeptService;

@RestController
@RequestMapping("/departments")
public class DeptController {

	@Autowired
	private DeptService deptService;
	
	@GetMapping
	public List<Dept> getAllDepts(){
		
		return deptService.getAllDepts();
	}
	
	@PostMapping
	public Dept createDept (@RequestBody Dept dept) {
		
		return deptService.createDept(dept);
		
	}
	

}
