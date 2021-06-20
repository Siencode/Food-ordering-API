package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleDao extends JpaRepository<ScheduleEntity, Long> {
}

