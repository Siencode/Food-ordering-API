package io.siencode.infrastructure.user.repository;

import io.siencode.infrastructure.user.domain.UserRoleEntity;

public interface UserRoleRepository {

    void add(UserRoleEntity userEntity);

    void delete(long id);

}
