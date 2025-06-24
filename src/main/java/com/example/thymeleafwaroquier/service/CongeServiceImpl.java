package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Conge;
import com.example.thymeleafwaroquier.model.Employee;
import com.example.thymeleafwaroquier.repository.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CongeServiceImpl implements CongeService {
    @Autowired
    private CongeRepository congeRepository;

    @Override
    public List<Conge> getCongesByEmployee(Employee employee) {
        return congeRepository.findByEmployee(employee);
    }

    @Override
    public Conge saveConge(Conge conge) {
        return congeRepository.save(conge);
    }

    @Override
    public void deleteConge(Long id) {
        congeRepository.deleteById(id);
    }
} 