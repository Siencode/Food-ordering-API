package io.siencode.resource.employee.repository.implementation;

import io.siencode.resource.employee.domain.EmployeeEntity;
import io.siencode.resource.employee.repository.EmployeeDao;
import io.siencode.resource.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final EmployeeDao dao;

    @Autowired
    public EmployeeRepositoryImpl(EmployeeDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(EmployeeEntity role) {
        dao.save(role);
    }

    @Override
    public List<EmployeeEntity> getEmployeeList() {
        return dao.findAll();
    }
}
