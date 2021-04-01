package io.siencode.resource.employee.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String firstName;
    String surname;
    String phoneNumber;
    String login;
    String password;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEEROLE_ID", referencedColumnName = "id")
    EmployeeRoleEntity role;


}
