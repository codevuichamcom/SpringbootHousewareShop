package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory,Integer> {
}
