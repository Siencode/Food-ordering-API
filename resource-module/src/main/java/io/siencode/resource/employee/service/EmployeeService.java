package io.siencode.resource.employee.service;

import io.siencode.resource.employee.domain.EmployeeEntity;
import io.siencode.resource.employee.domain.EmployeeRoleEntity;

import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> findAllEmployees();

    List<EmployeeRoleEntity> findAllRoles();

    void saveEmployee(EmployeeEntity employeeEntity);

    void saveRole(EmployeeRoleEntity roleEntity);

    void deleteEmployeeById(long id);

    void deleteRoleById(long id);

}
