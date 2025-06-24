package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Absence;
import com.example.thymeleafwaroquier.model.Employee;
import com.example.thymeleafwaroquier.repository.AbsenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService {
    @Autowired
    private AbsenceRepository absenceRepository;

    @Override
    public List<Absence> getAbsencesByEmployee(Employee employee) {
        return absenceRepository.findByEmployee(employee);
    }

    @Override
    public Absence saveAbsence(Absence absence) {
        return absenceRepository.save(absence);
    }

    @Override
    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);
    }
} 