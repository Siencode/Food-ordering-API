package io.siencode.resource.employee.repository.implementation;

import io.siencode.resource.employee.domain.EmployeeRoleEntity;
import io.siencode.resource.employee.repository.EmployeeRoleDao;
import io.siencode.resource.employee.repository.EmployeeRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRoleRepositoryImpl implements EmployeeRoleRepository {
    private final EmployeeRoleDao dao;

    @Autowired
    public EmployeeRoleRepositoryImpl(EmployeeRoleDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(EmployeeRoleEntity role) {
        dao.save(role);
    }

    @Override
    public List<EmployeeRoleEntity> getRoleList() {
        return dao.findAll();
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }
}
