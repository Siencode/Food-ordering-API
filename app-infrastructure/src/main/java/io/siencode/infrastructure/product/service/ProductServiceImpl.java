package io.siencode.infrastructure.product.service;

import io.siencode.infrastructure.product.domain.ProductEntity;
import io.siencode.infrastructure.product.domain.ProductGroupEntity;
import io.siencode.infrastructure.product.repository.implementation.ProductGroupRepositoryImpl;
import io.siencode.infrastructure.product.repository.implementation.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<ProductEntity> findAllProductsByGroupId(long id) {
        return productRepository.getProductList().stream().filter(productEntity -> productEntity.getGroup().getId() == id).collect(Collectors.toList());
    }

    @Override
    public void saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }

    @Override
    public void saveGroup(ProductGroupEntity productGroupEntity) {
        productGroupRepository.save(productGroupEntity);
    }

    @Override
    public void deleteProductById(long id) {
        productRepository.delete(id);
    }

    @Override
    public void deleteGroupById(long id) {
        productGroupRepository.delete(id);
    }
}
