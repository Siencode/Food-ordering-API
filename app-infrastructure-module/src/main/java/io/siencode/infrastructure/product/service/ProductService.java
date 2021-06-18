package io.siencode.infrastructure.product.service;

import io.siencode.infrastructure.product.domain.ProductEntity;
import io.siencode.infrastructure.product.domain.ProductGroupEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAllProducts();

    List<ProductGroupEntity> findAllGroups();

    List<ProductEntity> findAllProductsByGroupId(long id);

    void saveProduct(ProductEntity productEntity);

    void saveGroup(ProductGroupEntity groupEntity);

    void deleteProductById(long id);

    void deleteGroupById(long id);

}
