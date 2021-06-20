package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);
}
