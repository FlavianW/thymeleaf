package com.example.thymeleafwaroquier.controller;

import com.example.thymeleafwaroquier.model.Employee;
import com.example.thymeleafwaroquier.model.Conge;
import com.example.thymeleafwaroquier.model.Absence;
import com.example.thymeleafwaroquier.service.EmployeeService;
import com.example.thymeleafwaroquier.service.CongeService;
import com.example.thymeleafwaroquier.service.AbsenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CongeService congeService;
    @Autowired
    private AbsenceService absenceService;

    @GetMapping
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees/list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/form";
    }

    @PostMapping
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employees/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

    @GetMapping("/view/{id}")
    public String viewEmployee(@PathVariable Long id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        model.addAttribute("conges", congeService.getCongesByEmployee(employee));
        model.addAttribute("absences", absenceService.getAbsencesByEmployee(employee));
        return "employees/view";
    }

    @PostMapping("/view/{id}/add-conge")
    public String addConge(@PathVariable Long id, @RequestParam("debut") String debut, @RequestParam("fin") String fin) {
        Employee employee = employeeService.getEmployeeById(id);
        Conge conge = new Conge();
        conge.setEmployee(employee);
        conge.setDebut(java.time.LocalDate.parse(debut));
        conge.setFin(java.time.LocalDate.parse(fin));
        congeService.saveConge(conge);
        return "redirect:/employees/view/" + id;
    }

    @PostMapping("/view/{id}/add-absence")
    public String addAbsence(@PathVariable Long id, @RequestParam("debut") String debut, @RequestParam("fin") String fin) {
        Employee employee = employeeService.getEmployeeById(id);
        Absence absence = new Absence();
        absence.setEmployee(employee);
        absence.setDebut(java.time.LocalDate.parse(debut));
        absence.setFin(java.time.LocalDate.parse(fin));
        absenceService.saveAbsence(absence);
        return "redirect:/employees/view/" + id;
    }

    @DeleteMapping("/{id}/ajax")
    @ResponseBody
    public ResponseEntity<?> deleteEmployeeAjax(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
} 