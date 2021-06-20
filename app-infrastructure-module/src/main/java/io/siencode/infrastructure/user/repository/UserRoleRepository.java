package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserEntity;

import java.util.Optional;

public interface UserRepository {

    void add(UserEntity userEntity);

    void delete(long id);

    Optional<UserEntity> findByUsername(String username);
}
