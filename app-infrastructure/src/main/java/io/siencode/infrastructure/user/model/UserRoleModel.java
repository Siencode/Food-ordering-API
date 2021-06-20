package io.siencode.infrastructure.user.model;

import lombok.Value;

import java.util.Set;

@Value
public class UserRoleModel {

    String name;
    Set<Integer> rolesId;

}
