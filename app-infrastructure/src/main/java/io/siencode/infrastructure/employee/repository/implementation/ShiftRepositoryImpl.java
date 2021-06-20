package io.siencode.infrastructure.employee.repository.implementation;

import io.siencode.infrastructure.employee.domain.ShiftEntity;
import io.siencode.infrastructure.employee.repository.ShiftDao;
import io.siencode.infrastructure.employee.repository.ShiftRepository;
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
