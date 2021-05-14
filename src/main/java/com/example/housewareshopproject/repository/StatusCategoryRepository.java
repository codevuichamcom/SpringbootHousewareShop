package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.StatusAccount;
import com.example.housewareshopproject.entity.StatusCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusCategoryRepository extends JpaRepository<StatusCategory,Integer> {
}
