package io.siencode.infrastructure.user.repository.implementation;

import io.siencode.infrastructure.user.domain.UserEntity;
import io.siencode.infrastructure.user.repository.UserDao;
import io.siencode.infrastructure.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final UserDao dao;

    @Autowired
    public UserRepositoryImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(UserEntity userEntity) {
        dao.save(userEntity);
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }
}
