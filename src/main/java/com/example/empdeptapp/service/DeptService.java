package com.example.empdeptapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {

	@Autowired
	private DeptRepository deptrepository;
	
	public List<Dept> getAllDepts(){
		
		return deptRepository.findall();
	}
	
	public Dept createDept(Dept dept) {
		
		return deptRepository.save(dept)
	}
}
