package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Absence;
import com.example.thymeleafwaroquier.model.Employee;
import java.util.List;

public interface AbsenceService {
    List<Absence> getAbsencesByEmployee(Employee employee);
    Absence saveAbsence(Absence absence);
    void deleteAbsence(Long id);
} 