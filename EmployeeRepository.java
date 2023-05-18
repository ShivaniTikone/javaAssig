package com.qspider.employeeApi.Repository;

import com.qspider.employeeApi.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee>findByEmail(String email);
}
