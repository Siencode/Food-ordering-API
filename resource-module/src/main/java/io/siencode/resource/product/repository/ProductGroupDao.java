package io.siencode.resource.product.repository;

import io.siencode.resource.product.domain.ProductGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductGroupDao extends JpaRepository<ProductGroupEntity, Long> {
}
