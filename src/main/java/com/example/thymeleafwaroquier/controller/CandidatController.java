package com.example.thymeleafwaroquier.controller;

import com.example.thymeleafwaroquier.model.Candidat;
import com.example.thymeleafwaroquier.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/candidats")
public class CandidatController {
    @Autowired
    private CandidatService candidatService;

    @GetMapping
    public String listCandidats(Model model) {
        model.addAttribute("candidats", candidatService.getAllCandidats());
        return "candidats/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("candidat", new Candidat());
        return "candidats/form";
    }

    @PostMapping
    public String saveCandidat(@ModelAttribute Candidat candidat) {
        candidatService.saveCandidat(candidat);
        return "redirect:/candidats";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Candidat candidat = candidatService.getCandidatById(id);
        model.addAttribute("candidat", candidat);
        return "candidats/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCandidat(@PathVariable Long id) {
        candidatService.deleteCandidat(id);
        return "redirect:/candidats";
    }

    @GetMapping("/view/{id}")
    public String viewCandidat(@PathVariable Long id, Model model) {
        Candidat candidat = candidatService.getCandidatById(id);
        model.addAttribute("candidat", candidat);
        return "candidats/view";
    }
} 