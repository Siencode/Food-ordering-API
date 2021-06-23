package io.siencode.infrastructure.user.service;

import io.siencode.infrastructure.user.domain.UserRoleEntity;
import io.siencode.infrastructure.user.model.Role;
import io.siencode.infrastructure.user.model.UserRoleModel;
import io.siencode.infrastructure.user.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserRoleService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    public void saveUserRole(UserRoleModel userRoleModel) {
        final String userRoleName = userRoleModel.getName();
        List<Role> roleList = userRoleModel.getRolesId().stream()
                .filter(id -> Role.getUserRoleById(id).isPresent())
                .map(Role::getUserRoleById)
                .map(Optional::get)
                .collect(Collectors.toList());
        userRoleRepository.add(new UserRoleEntity(userRoleName, roleList));
    }

    public UserRoleEntity getUserRoles(Long id) {
        return userRoleRepository.getById(id).get();
    }
}
