package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.StatusAccount;
import com.example.housewareshopproject.entity.StatusSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusSubCategoryRepository extends JpaRepository<StatusSubCategory,Integer> {
}
