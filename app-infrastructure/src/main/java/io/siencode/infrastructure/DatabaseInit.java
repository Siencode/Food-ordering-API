package io.siencode.infrastructure;

import io.siencode.infrastructure.user.domain.UserEntity;
import io.siencode.infrastructure.user.domain.UserRoleEntity;
import io.siencode.infrastructure.user.model.Role;
import io.siencode.infrastructure.user.repository.UserRepository;
import io.siencode.infrastructure.user.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class DatabaseInit {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public DatabaseInit(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @PostConstruct
    private void init() {
        createAdministratorRole();
        createAdministratorUser();
    }

    private void createAdministratorRole() {
        if (userRoleRepository.getByName("administrator").isEmpty()) {
            UserRoleEntity userRole = new UserRoleEntity("administrator", Arrays.stream(Role.values()).collect(Collectors.toList()));
            userRoleRepository.add(userRole);
        }
    }

    private void createAdministratorUser() {
        if (userRepository.findByUsername("admin").isEmpty()) {
            UserRoleEntity userRole = userRoleRepository.getByName("administrator").get();
            UserEntity userEntity = new UserEntity();
            userEntity.setUsername("admin");
            userEntity.setPassword("admin");
            userEntity.setDescription("Administrator");

            userEntity.grantAuthority(userRole.getRoles());
            userRepository.add(userEntity);
        }
    }
}
