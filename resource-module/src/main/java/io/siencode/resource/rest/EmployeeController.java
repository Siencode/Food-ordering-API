package io.siencode.resource.rest;

import io.siencode.resource.employee.domain.EmployeeEntity;
import io.siencode.resource.employee.domain.EmployeeRoleEntity;
import io.siencode.resource.employee.domain.ScheduleEntity;
import io.siencode.resource.employee.domain.ShiftEntity;
import io.siencode.resource.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
        List<EmployeeEntity> productList = employeeService.findAllEmployees();
        if (productList == null || productList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No employee added");
        } else {
            return productList;
        }
    }

    @GetMapping("/role")
    public List<EmployeeRoleEntity> getRole() {
        List<EmployeeRoleEntity> roleList = employeeService.findAllRoles();

        if (roleList == null || roleList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No role added");
        } else {
            return roleList;
        }
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
        List<ScheduleEntity> getSchedule = employeeService.findAllSchedules();
        if (getSchedule == null || getSchedule.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No schedule added");
        } else {
            return getSchedule;
        }
    }

    @GetMapping("/shift")
    public List<ShiftEntity> getShift() {
        List<ShiftEntity> getShift = employeeService.findAllShifts();
        if (getShift == null || getShift.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No shift added");
        } else {
            return getShift;
        }
    }

    @GetMapping("/schedule/{year}/{month}/{id}")
    public List<ScheduleEntity> getScheduleByMonth(@PathVariable int year, @PathVariable int month, @PathVariable Long id) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        List<ScheduleEntity> getScheduleByMonth = employeeService.findAllScheduleByMonth(localDate, id);

        if (getScheduleByMonth == null || getScheduleByMonth.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("No shift added. Year: %d Month: %d UserID: %d", year, month, id));
        } else {
            return getScheduleByMonth;
        }
    }

    @GetMapping("/schedule/{year}/{month}")
    public List<ScheduleEntity> getScheduleByMonth(@PathVariable int year, @PathVariable int month) {
        LocalDate localDate = LocalDate.of(year, month, 1);
        List<ScheduleEntity> getScheduleByMonth = employeeService.findAllScheduleByMonth(localDate, null);

        if (getScheduleByMonth == null || getScheduleByMonth.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("No shift added. Year: %d Month: %d", year, month));
        } else {
            return getScheduleByMonth;
        }
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
