package com.MimitosShop.API.Repository;


import com.MimitosShop.API.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
