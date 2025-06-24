package com.example.thymeleafwaroquier.repository;

import com.example.thymeleafwaroquier.model.Conge;
import com.example.thymeleafwaroquier.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CongeRepository extends JpaRepository<Conge, Long> {
    List<Conge> findByEmployee(Employee employee);
} 