package com.example.empdeptapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.empdeptapp.entity.Dept;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long> {
	

}
