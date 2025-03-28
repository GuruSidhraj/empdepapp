package com.example.empdeptapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empdeptapp.entity.Dept;
import com.example.empdeptapp.repo.DeptRepository;

@Service
public class DeptService {

	@Autowired
	private DeptRepository deptrepository;
	
	public List<Dept> getAllDepts(){
		
		return deptrepository.findAll();
	}
	
	public Dept createDept(Dept dept) {
		
		return deptrepository.save(dept);
	}
}
