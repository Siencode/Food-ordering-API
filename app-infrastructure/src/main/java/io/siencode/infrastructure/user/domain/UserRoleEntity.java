package io.siencode.infrastructure.user.domain;

import io.siencode.infrastructure.user.model.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "UserRole")
@NoArgsConstructor
public class UserRoleEntity {

    public UserRoleEntity(String name, Set<Role> roles) {
        this.name = name;
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;

    public void addRole(Role role) {
        roles.add(role);
    }
}
