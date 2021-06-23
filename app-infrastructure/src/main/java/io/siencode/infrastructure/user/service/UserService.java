package io.siencode.infrastructure.user.service;

import io.siencode.infrastructure.user.domain.UserEntity;
import io.siencode.infrastructure.user.domain.UserRoleEntity;
import io.siencode.infrastructure.user.model.UserModel;
import io.siencode.infrastructure.user.repository.UserRepository;
import io.siencode.infrastructure.user.repository.UserRoleRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    public void saveUser(UserModel userModel) {
        UserEntity user = new UserEntity();
        user.setUsername(userModel.getUsername());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        UserRoleEntity userRole = userRoleRepository.getById(userModel.getUserRoleId()).get();
        user.grantAuthority(userRole.getRoles());
        try {
            userRepository.add(user);
        } catch (Exception exception) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "user cannot be added");
        }
    }

    public Boolean userIsExist(String username) {
        Optional<UserEntity> userOptional = userRepository.findByUsername(username);
        return userOptional.isPresent();
    }
}
