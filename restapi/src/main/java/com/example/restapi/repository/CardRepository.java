package com.example.restapi.repository;

import com.example.restapi.user.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
    Card getById(Integer id);
}
