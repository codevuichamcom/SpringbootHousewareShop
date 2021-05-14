package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.Order;
import com.example.housewareshopproject.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping,Long> {
}
