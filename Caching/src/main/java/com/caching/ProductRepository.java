package com.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.RedisTemplate;

public interface ProductRepository extends JpaRepository<Product,Integer > {

}
