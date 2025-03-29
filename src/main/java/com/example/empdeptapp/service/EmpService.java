package com.example.empdeptapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empdeptapp.entity.Emp;
import com.example.empdeptapp.repo.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
	public List<Emp> getEmployees(){
		
		return empRepository.findAll();
			
	}
	
	public Emp createEmployee(Emp emp) {
		
		return empRepository.save(emp);
		
	} 
	
	public List<Emp> getEmployeesByDept(Long deptId){
		
		return empRepository.findByDeptId(deptId);
	}

}
