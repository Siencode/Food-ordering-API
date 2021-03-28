package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Long> {
}
