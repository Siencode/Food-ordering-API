package io.siencode.resource.employee.repository.implementation;

import io.siencode.resource.employee.domain.ShiftEntity;
import io.siencode.resource.employee.repository.ShiftDao;
import io.siencode.resource.employee.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShiftRepositoryImpl implements ShiftRepository {
    private final ShiftDao dao;

    @Autowired
    public ShiftRepositoryImpl(ShiftDao dao) {
        this.dao = dao;
    }


    @Override
    public void save(ShiftEntity schedule) {
        dao.save(schedule);
    }

    @Override
    public List<ShiftEntity> getShiftList() {
        return dao.findAll();
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }
}
