package io.siencode.resource.rest;

import io.siencode.resource.employee.domain.EmployeeEntity;
import io.siencode.resource.employee.domain.EmployeeRoleEntity;
import io.siencode.resource.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<EmployeeEntity> getProduct() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/role")
    public List<EmployeeRoleEntity> getGroup() {
        return employeeService.findAllRoles();
    }

    @PostMapping("/employee")
    public void saveProduct(@RequestBody EmployeeEntity employeeEntity) {
        employeeService.saveEmployee(employeeEntity);
    }

    @PostMapping("/role")
    public void saveGroup(@RequestBody EmployeeRoleEntity employeeRoleEntity) {
        employeeService.saveRole(employeeRoleEntity);
    }

}
