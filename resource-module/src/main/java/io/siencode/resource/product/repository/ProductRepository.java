package io.siencode.resource.product.repository;


import io.siencode.resource.product.domain.ProductEntity;

import java.util.List;

public interface ProductRepository {

    List<ProductEntity> getProductList();

    void save(ProductEntity productEntity);

    void delete(long id);
}
