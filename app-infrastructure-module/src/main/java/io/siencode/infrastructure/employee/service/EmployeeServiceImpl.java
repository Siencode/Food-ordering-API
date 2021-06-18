package io.siencode.infrastructure.employee.service;

import io.siencode.infrastructure.employee.domain.EmployeeEntity;
import io.siencode.infrastructure.employee.domain.EmployeeRoleEntity;
import io.siencode.infrastructure.employee.domain.ScheduleEntity;
import io.siencode.infrastructure.employee.domain.ShiftEntity;
import io.siencode.infrastructure.employee.repository.implementation.EmployeeRepositoryImpl;
import io.siencode.infrastructure.employee.repository.implementation.EmployeeRoleRepositoryImpl;
import io.siencode.infrastructure.employee.repository.implementation.ScheduleRepositoryImpl;
import io.siencode.infrastructure.employee.repository.implementation.ShiftRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryImpl employeeRepository;
    private final EmployeeRoleRepositoryImpl employeeRoleRepository;
    private final ScheduleRepositoryImpl scheduleRepository;
    private final ShiftRepositoryImpl shiftRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository, EmployeeRoleRepositoryImpl employeeRoleRepository, ScheduleRepositoryImpl scheduleRepository, ShiftRepositoryImpl shiftRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeRoleRepository = employeeRoleRepository;
        this.scheduleRepository = scheduleRepository;
        this.shiftRepository = shiftRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return employeeRepository.getEmployeeList();
    }

    @Override
    public List<EmployeeRoleEntity> findAllRoles() {
        return employeeRoleRepository.getRoleList();
    }

    @Override
    public List<ScheduleEntity> findAllSchedules() {
        return scheduleRepository.getScheduleList();
    }

    @Override
    public List<ShiftEntity> findAllShifts() {
        return shiftRepository.getShiftList();
    }

    @Override
    public List<ScheduleEntity> findAllScheduleByMonth(LocalDate localDate, Long userId) {
        if (userId == null) {
            return scheduleRepository.getScheduleList().stream()
                    .filter(scheduleEntity -> scheduleEntity.getDate().getYear() == localDate.getYear())
                    .filter(scheduleEntity -> scheduleEntity.getDate().getMonth() == localDate.getMonth())
                    .collect(Collectors.toList());
        } else {
            return scheduleRepository.getScheduleList().stream()
                    .filter(scheduleEntity -> scheduleEntity.getEmployeeEntity().getId() == userId)
                    .filter(scheduleEntity -> scheduleEntity.getDate().getYear() == localDate.getYear())
                    .filter(scheduleEntity -> scheduleEntity.getDate().getMonth() == localDate.getMonth())
                    .collect(Collectors.toList());
        }

    }

    @Override
    public void saveEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
    }

    @Override
    public void saveRole(EmployeeRoleEntity roleEntity) {
        employeeRoleRepository.save(roleEntity);
    }

    @Override
    public void saveSchedule(ScheduleEntity scheduleEntity) {
        scheduleRepository.save(scheduleEntity);
    }

    @Override
    public void saveShift(ShiftEntity shiftEntity) {
        shiftRepository.save(shiftEntity);
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.delete(id);
    }

    @Override
    public void deleteRoleById(long id) {
        employeeRoleRepository.delete(id);
    }

    @Override
    public void deleteShiftById(long id) {
        shiftRepository.delete(id);
    }

    @Override
    public void deleteScheduleById(long id) {
        scheduleRepository.delete(id);
    }
}
