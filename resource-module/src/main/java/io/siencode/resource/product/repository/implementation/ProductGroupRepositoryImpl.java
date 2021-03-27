package io.siencode.resource.product.repository.implementation;

import io.siencode.resource.product.domain.ProductGroupEntity;
import io.siencode.resource.product.repository.ProductGroupDao;
import io.siencode.resource.product.repository.ProductGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductGroupRepositoryImpl implements ProductGroupRepository {
    private final ProductGroupDao dao;

    @Autowired
    public ProductGroupRepositoryImpl(ProductGroupDao dao) {
        this.dao = dao;
    }

    @Override
    public List<ProductGroupEntity> getGroupList() {
        return dao.findAll();
    }

    @Override
    public void save(ProductGroupEntity productGroupEntity) {
        dao.save(productGroupEntity);
    }
}
