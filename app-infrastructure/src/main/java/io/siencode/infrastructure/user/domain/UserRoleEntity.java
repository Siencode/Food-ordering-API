package io.siencode.infrastructure.user.domain;

import io.siencode.infrastructure.user.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "UserRole")
@NoArgsConstructor
public class UserRoleEntity {


    public UserRoleEntity(String name, List<Role> roles) {
        this.name = name;
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    private List<Role> roles;

    @Override
    public String toString() {
        return "UserRoleEntity";
    }
}
