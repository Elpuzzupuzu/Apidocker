package com.MimitosShop.API.Repository;

import com.MimitosShop.API.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

