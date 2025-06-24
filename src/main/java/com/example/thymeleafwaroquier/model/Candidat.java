package com.example.thymeleafwaroquier.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String numeroIdentification;
    private String adresse;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String domaineTechnique;
    private String evaluation;
    private LocalDate dateEntretien;
    private String observation;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getNumeroIdentification() { return numeroIdentification; }
    public void setNumeroIdentification(String numeroIdentification) { this.numeroIdentification = numeroIdentification; }
    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public LocalDate getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(LocalDate dateNaissance) { this.dateNaissance = dateNaissance; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public String getDomaineTechnique() { return domaineTechnique; }
    public void setDomaineTechnique(String domaineTechnique) { this.domaineTechnique = domaineTechnique; }
    public String getEvaluation() { return evaluation; }
    public void setEvaluation(String evaluation) { this.evaluation = evaluation; }
    public LocalDate getDateEntretien() { return dateEntretien; }
    public void setDateEntretien(LocalDate dateEntretien) { this.dateEntretien = dateEntretien; }
    public String getObservation() { return observation; }
    public void setObservation(String observation) { this.observation = observation; }
} 