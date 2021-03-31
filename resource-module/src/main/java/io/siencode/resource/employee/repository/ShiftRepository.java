package io.siencode.resource.employee.repository;

import io.siencode.resource.employee.domain.ShiftEntity;

import java.util.List;

public interface ShiftRepository {

    void save(ShiftEntity schedule);

    List<ShiftEntity> getShiftList();

    void delete(long id);

}
