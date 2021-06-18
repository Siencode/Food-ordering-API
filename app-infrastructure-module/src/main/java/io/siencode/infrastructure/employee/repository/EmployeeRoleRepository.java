package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.EmployeeRoleEntity;

import java.util.List;

public interface EmployeeRoleRepository {

    void save(EmployeeRoleEntity role);

    List<EmployeeRoleEntity> getRoleList();

    void delete(long id);
}
