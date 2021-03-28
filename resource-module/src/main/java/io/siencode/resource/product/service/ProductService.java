package io.siencode.resource.product.service;

import io.siencode.resource.product.domain.ProductEntity;
import io.siencode.resource.product.domain.ProductGroupEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAllProducts();

    List<ProductGroupEntity> findAllGroups();

    void saveProduct(ProductEntity productEntity);

    void saveGroup(ProductGroupEntity groupEntity);

    void deleteProductById(long id);

    void deleteGroupById(long id);

}
