package io.siencode.infrastructure.product.repository;


import io.siencode.infrastructure.product.domain.ProductGroupEntity;

import java.util.List;

public interface ProductGroupRepository {

    List<ProductGroupEntity> getGroupList();

    void save(ProductGroupEntity productGroupEntity);

    void delete(long id);
}
