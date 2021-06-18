package io.siencode.infrastructure.employee.repository;

import io.siencode.infrastructure.employee.domain.ShiftEntity;

import java.util.List;

public interface ShiftRepository {

    void save(ShiftEntity schedule);

    List<ShiftEntity> getShiftList();

    void delete(long id);

}
