package com.javatechie.saga.repository;

import com.javatechie.saga.entity.UserBalance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBalanceRepository extends JpaRepository<UserBalance,Integer> {
}