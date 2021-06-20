package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.ScheduleEntity;

import java.util.List;

public interface ScheduleRepository {

    void save(ScheduleEntity schedule);

    List<ScheduleEntity> getScheduleList();

    void delete(long id);

}
