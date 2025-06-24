package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Candidat;
import com.example.thymeleafwaroquier.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatServiceImpl implements CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    @Override
    public List<Candidat> getAllCandidats() {
        return candidatRepository.findAll();
    }

    @Override
    public Candidat getCandidatById(Long id) {
        Optional<Candidat> cand = candidatRepository.findById(id);
        return cand.orElse(null);
    }

    @Override
    public Candidat saveCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public void deleteCandidat(Long id) {
        candidatRepository.deleteById(id);
    }
} 