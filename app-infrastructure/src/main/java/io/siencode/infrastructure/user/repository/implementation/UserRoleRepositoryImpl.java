package io.siencode.infrastructure.user.repository.implementation;

import io.siencode.infrastructure.user.domain.UserRoleEntity;
import io.siencode.infrastructure.user.repository.UserRoleDao;
import io.siencode.infrastructure.user.repository.UserRoleRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRoleRepositoryImpl implements UserRoleRepository {
    private final UserRoleDao dao;

    public UserRoleRepositoryImpl(UserRoleDao dao) {
        this.dao = dao;
    }


    @Override
    public void add(UserRoleEntity userRoleEntity) {
        dao.save(userRoleEntity);
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }

    @Override
    public Optional<UserRoleEntity> getById(long id) {
        return dao.findById(id);
    }
}
