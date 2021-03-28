package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.EmployeeRoleEntity;

import java.util.List;

public interface EmployeeRoleRepository {

    void save(EmployeeRoleEntity role);

    List<EmployeeRoleEntity> getRoleList();
}
