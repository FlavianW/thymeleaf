package com.example.thymeleafwaroquier.repository;

import com.example.thymeleafwaroquier.model.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {
} 