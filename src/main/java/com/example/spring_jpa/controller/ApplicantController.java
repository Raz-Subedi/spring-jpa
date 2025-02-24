package com.example.spring_jpa.controller;

import com.example.spring_jpa.entity.Applicant;
import com.example.spring_jpa.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {

    @Autowired
    private ApplicantService applicantService;

    @GetMapping
    public List<Applicant> getApplicants() {
        return applicantService.getALlApplicants();
    }

    @PostMapping
    public Applicant saveApplicant(@RequestBody Applicant applicant) {
        return applicantService.saveApplicant(applicant);
    }

    @GetMapping("/page")
    public Iterable<Applicant> getApplicantsWithPagination(@RequestParam int page, @RequestParam int size) {
        return applicantService.getApplicantsWithPagination(page, size);
    }

    @GetMapping("/status")
    public List<Applicant> getApplicantsByStatus(@RequestParam String status) {
        return applicantService.getApplicantByStatus(status);
    }

    @GetMapping("/name")
    public List<Applicant> getApplicantsByPartialName(@RequestParam String name) {
        return applicantService.getApplicantByPartialName(name);
    }
}
