package io.siencode.infrastructure.product.repository;

import io.siencode.infrastructure.product.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDao extends JpaRepository<ProductEntity, Long> {
}