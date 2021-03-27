package io.siencode.resource.product.service;

import io.siencode.resource.product.domain.ProductEntity;
import io.siencode.resource.product.domain.ProductGroupEntity;
import io.siencode.resource.product.repository.implementation.ProductGroupRepositoryImpl;
import io.siencode.resource.product.repository.implementation.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepositoryImpl productRepository;
    ProductGroupRepositoryImpl productGroupRepository;

    @Autowired
    public ProductServiceImpl(ProductRepositoryImpl productRepository, ProductGroupRepositoryImpl productGroupRepository) {
        this.productRepository = productRepository;
        this.productGroupRepository = productGroupRepository;
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        return productRepository.getProductList();
    }

    @Override
    public List<ProductGroupEntity> findAllGroups() {
        return productGroupRepository.getGroupList();
    }

    @Override
    public void saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    @Override
    public void saveGroup(ProductGroupEntity productGroupEntity) {
        productGroupRepository.save(productGroupEntity);
    }
}
