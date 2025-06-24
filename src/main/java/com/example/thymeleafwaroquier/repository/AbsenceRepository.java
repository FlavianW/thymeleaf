package com.example.thymeleafwaroquier.repository;

import com.example.thymeleafwaroquier.model.Absence;
import com.example.thymeleafwaroquier.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AbsenceRepository extends JpaRepository<Absence, Long> {
    List<Absence> findByEmployee(Employee employee);
} 