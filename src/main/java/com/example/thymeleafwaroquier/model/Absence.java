package com.example.thymeleafwaroquier.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate debut;
    private LocalDate fin;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDate getDebut() { return debut; }
    public void setDebut(LocalDate debut) { this.debut = debut; }
    public LocalDate getFin() { return fin; }
    public void setFin(LocalDate fin) { this.fin = fin; }
    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
} 