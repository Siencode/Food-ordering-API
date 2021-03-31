package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.ScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleDao extends JpaRepository<ScheduleEntity, Long> {
}

