package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleDao extends JpaRepository<UserRoleEntity, Long> {

    Optional<UserRoleEntity> findByName(String name);
}
