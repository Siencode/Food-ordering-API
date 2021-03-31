package io.siencode.resource.rest;

import io.siencode.resource.employee.domain.EmployeeEntity;
import io.siencode.resource.employee.domain.EmployeeRoleEntity;
import io.siencode.resource.employee.domain.ScheduleEntity;
import io.siencode.resource.employee.domain.ShiftEntity;
import io.siencode.resource.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @Autowired
    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public List<EmployeeEntity> getProduct() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/role")
    public List<EmployeeRoleEntity> getGroup() {
        return employeeService.findAllRoles();
    }

    @PostMapping("/employee")
    public void saveProduct(@RequestBody EmployeeEntity employeeEntity) {
        employeeService.saveEmployee(employeeEntity);
    }

    @PostMapping("/role")
    public void saveGroup(@RequestBody EmployeeRoleEntity employeeRoleEntity) {
        employeeService.saveRole(employeeRoleEntity);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
    }

    @DeleteMapping("/role/{id}")
    public void deleteRole(@PathVariable Long id) {
        employeeService.deleteRoleById(id);
    }

    @GetMapping("/schedule")
    public List<ScheduleEntity> getSchedule() {
        return employeeService.findAllSchedules();
    }

    @GetMapping("/shift")
    public List<ShiftEntity> getShift() {
        return employeeService.findAllShifts();
    }

    @GetMapping("/schedule/{year}/{month}/{id}")
    public List<ScheduleEntity> getScheduleByMonth(@PathVariable int year, @PathVariable int month, @PathVariable Long id) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        return employeeService.findAllScheduleByMonth(localDate, id);
    }

    @GetMapping("/schedule/{year}/{month}")
    public List<ScheduleEntity> getScheduleByMonth(@PathVariable int year, @PathVariable int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        return employeeService.findAllScheduleByMonth(localDate, null);
    }

    @PostMapping("/schedule")
    public void saveSchedule(@RequestBody ScheduleEntity scheduleEntity) {
        employeeService.saveSchedule(scheduleEntity);
    }

    @PostMapping("/shift")
    public void saveShift(@RequestBody ShiftEntity shiftEntity) {
        employeeService.saveShift(shiftEntity);
    }

    @DeleteMapping("/schedule/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        employeeService.deleteScheduleById(id);
    }

    @DeleteMapping("/shift/{id}")
    public void deleteShift(@PathVariable Long id) {
        employeeService.deleteShiftById(id);
    }

}
