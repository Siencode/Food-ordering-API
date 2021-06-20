package io.siencode.infrastructure.product.repository;


import io.siencode.infrastructure.product.domain.ProductEntity;

import java.util.List;

public interface ProductRepository {

    List<ProductEntity> getProductList();

    void save(ProductEntity productEntity);

    void delete(long id);
}
