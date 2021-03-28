package io.siencode.resource.rest;

import io.siencode.resource.product.domain.ProductEntity;
import io.siencode.resource.product.domain.ProductGroupEntity;
import io.siencode.resource.product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/product")
    public List<ProductEntity> getProduct() {
        return productService.findAllProducts();
    }

    @GetMapping("/group")
    public List<ProductGroupEntity> getGroup() {
        return productService.findAllGroups();
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody ProductEntity productEntity) {
        productService.saveProduct(productEntity);
    }

    @PostMapping("/group")
    public void saveGroup(@RequestBody ProductGroupEntity groupEntity) {
        productService.saveGroup(groupEntity);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
    }

    @DeleteMapping("/group/{id}")
    public void deleteGroup(@PathVariable Long id) {
        productService.deleteGroupById(id);
    }
}
