package com.caching;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CacheConfig(cacheNames = "{Product}")
public class ProductController {
    private final ProductRepository pr;
    public ProductController(ProductRepository pr) {
        this.pr = pr;
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        Product save = pr.save(product);
        return "product saved with id :"+save.getId();
    }

    @GetMapping
    @Cacheable(value = "Product")
    public List<Product> getAllProducts(){
        return pr.findAll();
    }

    @GetMapping("/{id}")
    @Cacheable(key="#id",value = "Product")
    public Product getProductById(@PathVariable int id){
        return pr.findById(id).get();
    }

    @DeleteMapping("/{id}")
    @CacheEvict(key="#id")
    public String deleteProduct(@PathVariable int id){
        pr.deleteById(id);
        return "product deleted with Id :"+id;
    }



}
