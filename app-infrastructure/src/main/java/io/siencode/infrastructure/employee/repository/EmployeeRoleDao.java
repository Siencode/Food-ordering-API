package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.EmployeeRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRoleDao extends JpaRepository<EmployeeRoleEntity, Long> {
}
