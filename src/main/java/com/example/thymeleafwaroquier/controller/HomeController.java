package com.example.thymeleafwaroquier.controller;

import com.example.thymeleafwaroquier.service.EmployeeService;
import com.example.thymeleafwaroquier.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CandidatService candidatService;

    @GetMapping({"/", "/index"})
    public String home(Model model) {
        model.addAttribute("employeeCount", employeeService.getAllEmployees().size());
        model.addAttribute("candidatCount", candidatService.getAllCandidats().size());
        return "index";
    }
} 