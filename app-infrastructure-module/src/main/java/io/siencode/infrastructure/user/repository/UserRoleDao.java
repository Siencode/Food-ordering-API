package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleDao extends JpaRepository<UserRoleEntity, Long> {
}
