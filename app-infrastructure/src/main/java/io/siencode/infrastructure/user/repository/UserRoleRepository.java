package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserRoleEntity;

import java.util.Optional;

public interface UserRoleRepository {

    void add(UserRoleEntity userRoleEntity);

    void delete(long id);

    Optional<UserRoleEntity> getById(long id);

    Optional<UserRoleEntity> getByName(String name);

}
