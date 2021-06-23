package io.siencode.infrastructure.rest;

import io.siencode.infrastructure.user.domain.UserRoleEntity;
import io.siencode.infrastructure.user.model.Role;
import io.siencode.infrastructure.user.model.UserModel;
import io.siencode.infrastructure.user.model.UserRoleModel;
import io.siencode.infrastructure.user.service.UserRoleService;
import io.siencode.infrastructure.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    private final UserRoleService userRoleService;


    public UserController(UserService userService, UserRoleService userRoleService) {
        this.userService = userService;
        this.userRoleService = userRoleService;
    }

    @GetMapping("/userinfo")
    public String getUsername(Principal principal) {
        return principal.getName();
    }


    @PreAuthorize("hasAnyRole('USER_MODIFICATION')")//FIXME
    @PostMapping("/register")
    public void userRegister(@Valid @RequestBody UserModel userModel) {
        if (userService.userIsExist(userModel.getUsername())) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "The username exists. Can't be duplicated.");
        } else {
            userService.saveUser(userModel);
        }
    }

    @PreAuthorize("hasAnyRole('USER_MODIFICATION')")
    @PostMapping("/userRole")
    public void addUserRole(@Valid @RequestBody UserRoleModel userRoleModel) {
        userRoleService.saveUserRole(userRoleModel);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/userRole/{id}")
    public UserRoleEntity getUserRoleById(@PathVariable Long id) {
        return userRoleService.getUserRoles(id);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/roles")
    public Role[] getRoles() {
        return Role.values();
    }
}
