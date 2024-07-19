package com.MimitosShop.API.Repository;


import com.MimitosShop.API.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

