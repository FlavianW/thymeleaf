package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Conge;
import com.example.thymeleafwaroquier.model.Employee;
import java.util.List;

public interface CongeService {
    List<Conge> getCongesByEmployee(Employee employee);
    Conge saveConge(Conge conge);
    void deleteConge(Long id);
} 