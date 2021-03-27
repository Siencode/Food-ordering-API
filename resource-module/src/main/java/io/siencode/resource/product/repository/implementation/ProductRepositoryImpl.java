package io.siencode.resource.product.repository.implementation;

import io.siencode.resource.product.domain.ProductEntity;
import io.siencode.resource.product.repository.ProductDao;
import io.siencode.resource.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductDao dao;

    @Autowired
    public ProductRepositoryImpl(ProductDao dao) {
        this.dao = dao;
    }

    @Override
    public List<ProductEntity> getProductList() {
        return dao.findAll();
    }

    @Override
    public void save(ProductEntity productEntity) {
        dao.save(productEntity);
    }
}
