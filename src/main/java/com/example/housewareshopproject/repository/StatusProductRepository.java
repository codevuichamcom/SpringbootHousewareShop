package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.StatusAccount;
import com.example.housewareshopproject.entity.StatusProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusProductRepository extends JpaRepository<StatusProduct,Integer> {
}
