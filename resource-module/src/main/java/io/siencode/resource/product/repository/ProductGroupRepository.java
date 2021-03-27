package io.siencode.resource.product.repository;


import io.siencode.resource.product.domain.ProductGroupEntity;

import java.util.List;

public interface ProductGroupRepository {

    List<ProductGroupEntity> getGroupList();

    void save(ProductGroupEntity productGroupEntity);

}
