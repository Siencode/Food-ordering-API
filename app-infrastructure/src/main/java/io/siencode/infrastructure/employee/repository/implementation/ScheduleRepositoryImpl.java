package io.siencode.infrastructure.employee.repository.implementation;

import io.siencode.infrastructure.employee.domain.ScheduleEntity;
import io.siencode.infrastructure.employee.repository.ScheduleDao;
import io.siencode.infrastructure.employee.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScheduleRepositoryImpl implements ScheduleRepository {
    private final ScheduleDao dao;

    @Autowired
    public ScheduleRepositoryImpl(ScheduleDao dao) {
        this.dao = dao;
    }


    @Override
    public void save(ScheduleEntity schedule) {
        dao.save(schedule);
    }

    @Override
    public List<ScheduleEntity> getScheduleList() {
        return dao.findAll();
    }

    @Override
    public void delete(long id) {
        dao.deleteById(id);
    }
}
