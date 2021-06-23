package io.siencode.infrastructure.rest;

import io.siencode.infrastructure.product.domain.ProductEntity;
import io.siencode.infrastructure.product.domain.ProductGroupEntity;
import io.siencode.infrastructure.product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    private final ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/product")
    public List<ProductEntity> getProduct() {
        List<ProductEntity> productList = productService.findAllProducts();
        if (productList == null || productList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No product added");
        } else {
            return productList;
        }
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/product/{id}")
    public List<ProductEntity> getProductByGroup(@PathVariable Long id) {
        List<ProductEntity> productList = productService.findAllProductsByGroupId(id);
        if (productList == null || productList.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("No product added with group %d", id ));
        } else {
            return productList;
        }
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/group")
    public List<ProductGroupEntity> getGroup() {
        List<ProductGroupEntity> productGroup = productService.findAllGroups();
        if (productGroup == null || productGroup.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No group added");
        } else {
            return productGroup;
        }
    }

    @PreAuthorize("hasAnyRole('PRODUCT_MODIFICATION')")
    @PostMapping("/product")
    public void saveProduct(@RequestBody ProductEntity productEntity) {
        productService.saveProduct(productEntity);
    }

    @PreAuthorize("hasAnyRole('PRODUCT_GROUP_MODIFICATION')")
    @PostMapping("/group")
    public void saveGroup(@RequestBody ProductGroupEntity groupEntity) {
        productService.saveGroup(groupEntity);
    }

    @PreAuthorize("hasAnyRole('PRODUCT_MODIFICATION')")
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @PreAuthorize("hasAnyRole('PRODUCT_GROUP_MODIFICATION')")
    @DeleteMapping("/group/{id}")
    public void deleteGroup(@PathVariable Long id) {
        productService.deleteGroupById(id);
    }
}
