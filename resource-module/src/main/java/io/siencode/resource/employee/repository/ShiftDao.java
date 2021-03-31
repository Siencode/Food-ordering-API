package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.ShiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftDao extends JpaRepository<ShiftEntity, Long> {
}

