package io.siencode.infrastructure.user.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "UserRole")
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roleName;
    boolean productModification;
    boolean productGroupModification;
    boolean userModification;
    boolean roleModification;
    boolean employeeModification;
    boolean employeeRoleModification;
    boolean scheduleModification;
    boolean shiftModification;

}
