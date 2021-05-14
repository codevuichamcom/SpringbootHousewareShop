package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.Category;
import com.example.housewareshopproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
