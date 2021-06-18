package io.siencode.infrastructure.employee.service;

import io.siencode.infrastructure.employee.domain.EmployeeEntity;
import io.siencode.infrastructure.employee.domain.EmployeeRoleEntity;
import io.siencode.infrastructure.employee.domain.ScheduleEntity;
import io.siencode.infrastructure.employee.domain.ShiftEntity;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeService {

    List<EmployeeEntity> findAllEmployees();

    List<EmployeeRoleEntity> findAllRoles();

    List<ScheduleEntity> findAllSchedules();

    List<ShiftEntity> findAllShifts();

    List<ScheduleEntity> findAllScheduleByMonth(LocalDate localDate, Long userId);

    void saveEmployee(EmployeeEntity employeeEntity);

    void saveRole(EmployeeRoleEntity roleEntity);

    void saveSchedule(ScheduleEntity scheduleEntity);

    void saveShift(ShiftEntity shiftEntity);

    void deleteEmployeeById(long id);

    void deleteRoleById(long id);

    void deleteShiftById(long id);

    void deleteScheduleById(long id);
}
