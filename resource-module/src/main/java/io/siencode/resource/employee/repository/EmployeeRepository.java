package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.EmployeeEntity;

import java.util.List;

public interface EmployeeRepository {

    void save(EmployeeEntity role);

    List<EmployeeEntity> getEmployeeList();

    void delete(long id);
}
