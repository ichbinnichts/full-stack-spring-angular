package com.example.demo.model.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Query("DELETE e FROM Employee e WHERE e.id = ?1")
    void deleteEmployeeById(Long id);

    @Query("SELECT e FROM Employee e WHERE e.id = ?1")
    Optional<Employee> findEmployeeById(Long id);
    
}
