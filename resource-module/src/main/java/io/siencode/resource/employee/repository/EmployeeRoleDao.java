package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.EmployeeRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRoleDao extends JpaRepository<EmployeeRoleEntity, Long> {
}
