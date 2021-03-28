package io.siencode.resource.employee.service;

import io.siencode.resource.employee.domain.EmployeeEntity;
import io.siencode.resource.employee.domain.EmployeeRoleEntity;
import io.siencode.resource.employee.repository.implementation.EmployeeRepositoryImpl;
import io.siencode.resource.employee.repository.implementation.EmployeeRoleRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl employeeRepository;
    private final EmployeeRoleRepositoryImpl employeeRoleRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository, EmployeeRoleRepositoryImpl employeeRoleRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeRoleRepository = employeeRoleRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return employeeRepository.getEmployeeList();
    }

    @Override
    public List<EmployeeRoleEntity> findAllRoles() {
        return employeeRoleRepository.getRoleList();
    }

    @Override
    public void saveEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
    }

    @Override
    public void saveRole(EmployeeRoleEntity roleEntity) {
        employeeRoleRepository.save(roleEntity);
    }
}
