package com.example.empdeptapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.empdeptapp.entity.Dept;
import com.example.empdeptapp.entity.Emp;
import com.example.empdeptapp.repo.DeptRepository;
import com.example.empdeptapp.repo.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepository;
	
	@Autowired
	private DeptRepository deptRepository;
	
	public List<Emp> getEmployees(){
		
		return empRepository.findAll();
			
	}
	
	@Transactional
	public Emp createEmployee(Emp emp) {
		
		Long deptId =emp.getDept().getId();
		
		Dept dept=deptRepository.findById(deptId).orElseThrow(()-> new RuntimeException("department not found"));
		
		emp.setDept(dept); 
		return empRepository.save(emp);
		
	} 
	
	public List<Emp> getEmployeesByDept(Long deptId){
		
		return empRepository.findByDeptId(deptId);
	}

}
