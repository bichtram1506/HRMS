package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.AwardsType;

@Repository
public interface AwardsTypeRepository extends JpaRepository<AwardsType, Long> {
}