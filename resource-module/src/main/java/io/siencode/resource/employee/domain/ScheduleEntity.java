package io.siencode.resource.employee.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    LocalDate date;
    @ManyToOne
    @JoinColumn(name = "SHIFT_ID", referencedColumnName = "id")
    ShiftEntity shiftEntity;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "id")
    EmployeeEntity employeeEntity;
}
