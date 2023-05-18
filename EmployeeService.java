package com.qspider.employeeApi.Service;

import com.qspider.employeeApi.Model.Employee;
import com.qspider.employeeApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    public List<Employee> getEmployee(){
        List<Employee> employeeList=repository.findAll();
        return employeeList;
    }
    public Employee getEmployeeById(int id){
        Employee b=repository.findById(id).orElse(null);
        return b;
    }
    public Employee getEmployeeByEmail(String email){
        Employee b= (Employee) repository.findByEmail(email);
        return b;
    }
    public void addEmployee(Employee b){
        repository.save(b);
    }
    public void updateEmployee(Employee b){
        repository.save(b);
    }
    public void deleteById(int id){
        repository.deleteById(id);
    }



}
