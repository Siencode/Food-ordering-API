package io.siencode.infrastructure.product.repository;

import io.siencode.infrastructure.product.domain.ProductGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductGroupDao extends JpaRepository<ProductGroupEntity, Long> {
}
