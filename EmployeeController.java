package com.qspider.employeeApi.Controller;
import com.qspider.employeeApi.Model.Employee;
import com.qspider.employeeApi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/user1")
    public List<Employee> getEmployee(){
        return service.getEmployee();
    }
    @GetMapping("/user1/{id}")
    public Employee geEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }
    @GetMapping("/user1/find/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email){
        return service.getEmployeeByEmail(email);
    }
    @PostMapping("/user1")
    public void addEmployee(@RequestBody Employee b){
        service.addEmployee(b);
    }
    @PutMapping("/user1")
    public void updateEmployee(@RequestBody Employee b){
        service.updateEmployee(b);
    }
    @DeleteMapping("user1/delete/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }


}
