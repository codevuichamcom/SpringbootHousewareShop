package com.example.housewareshopproject.repository;

import com.example.housewareshopproject.entity.RoleAccount;
import com.example.housewareshopproject.entity.StatusAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusAccountRepository extends JpaRepository<StatusAccount,Integer> {
}
