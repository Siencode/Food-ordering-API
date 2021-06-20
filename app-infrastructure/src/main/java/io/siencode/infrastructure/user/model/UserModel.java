package io.siencode.infrastructure.user.model;

import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class UserModel {

    @NotNull(message = "Username cannot be null")
    @Size(min = 5, max = 20, message = "Incorrect username length")
    String username;
    @NotNull(message = "Password cannot be null")
    @Size(min = 5, max = 20, message = "Incorrect password length")
    String password;
    @NotNull(message = "Role id cannot be null")
    Integer userRoleId;

}
