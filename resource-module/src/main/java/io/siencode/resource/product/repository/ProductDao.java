package io.siencode.resource.product.repository;

import io.siencode.resource.product.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductDao extends JpaRepository<ProductEntity, Long> {
}