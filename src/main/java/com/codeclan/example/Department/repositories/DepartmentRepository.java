package com.codeclan.example.Department.repositories;

import com.codeclan.example.Department.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
