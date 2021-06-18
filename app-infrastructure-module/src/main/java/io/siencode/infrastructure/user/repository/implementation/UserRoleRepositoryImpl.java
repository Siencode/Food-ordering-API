package io.siencode.infrastructure.user.repository.implementation;

import io.siencode.infrastructure.user.domain.UserRoleEntity;
import io.siencode.infrastructure.user.repository.UserRoleDao;
import io.siencode.infrastructure.user.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRoleRepositoryImpl implements UserRoleRepository {
    private final UserRoleDao dao;

    @Autowired
    public UserRoleRepositoryImpl(UserRoleDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(UserRoleEntity userEntity) {
        dao.save(userEntity);
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }
}
