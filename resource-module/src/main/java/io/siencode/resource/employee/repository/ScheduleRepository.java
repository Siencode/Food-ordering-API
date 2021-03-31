package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.ScheduleEntity;

import java.util.List;

public interface ScheduleRepository {

    void save(ScheduleEntity schedule);

    List<ScheduleEntity> getScheduleList();

    void delete(long id);

}
