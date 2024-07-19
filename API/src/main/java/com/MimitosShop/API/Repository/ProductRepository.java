package com.MimitosShop.API.Repository;


import com.MimitosShop.API.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String keyword);

    List<Product> findByCategoryName(String categoryName);
}
