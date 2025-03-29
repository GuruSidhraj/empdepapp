package com.example.empdeptapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empdeptapp.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
	
	List<Emp> findByDeptId (Long deptId);
		

}


