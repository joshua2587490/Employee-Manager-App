package tech.zhenhua.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.zhenhua.employeemanager.exception.UserNotFoundException;
import tech.zhenhua.employeemanager.model.Employee;
import tech.zhenhua.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

/**
 * @author
 * @create 2022-02-13-2:14 AM
 */

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    @Transactional
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }

}
