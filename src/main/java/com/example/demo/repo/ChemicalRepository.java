package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.ChemicalElement;

@Repository
public interface ChemicalRepository extends JpaRepository<ChemicalElement, Long> {
}
