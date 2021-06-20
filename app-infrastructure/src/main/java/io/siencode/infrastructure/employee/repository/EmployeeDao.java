package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Long> {
}
