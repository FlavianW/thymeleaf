package com.example.thymeleafwaroquier.service;

import com.example.thymeleafwaroquier.model.Candidat;
import java.util.List;

public interface CandidatService {
    List<Candidat> getAllCandidats();
    Candidat getCandidatById(Long id);
    Candidat saveCandidat(Candidat candidat);
    void deleteCandidat(Long id);
} 