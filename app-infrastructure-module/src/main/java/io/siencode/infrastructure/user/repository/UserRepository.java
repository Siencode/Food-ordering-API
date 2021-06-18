package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserEntity;

public interface UserRepository {

    void add(UserEntity userEntity);

    void delete(long id);

}
