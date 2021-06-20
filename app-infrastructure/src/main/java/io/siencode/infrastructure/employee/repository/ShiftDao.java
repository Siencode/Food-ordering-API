package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.ShiftEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftDao extends JpaRepository<ShiftEntity, Long> {
}

