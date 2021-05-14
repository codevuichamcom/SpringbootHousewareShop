package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.Account;
import com.example.housewareshopproject.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
