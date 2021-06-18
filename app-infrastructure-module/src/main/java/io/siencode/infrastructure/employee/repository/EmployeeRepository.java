package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.EmployeeEntity;

import java.util.List;

public interface EmployeeRepository {

    void save(EmployeeEntity role);

    List<EmployeeEntity> getEmployeeList();

    void delete(long id);
}
