package com.example.spring_jpa.controller;

import com.example.spring_jpa.entity.Application;
import com.example.spring_jpa.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/{applicantId}")
    public ResponseEntity<Application> createApplications(@PathVariable Long applicantId, @RequestBody Application application){
        return ResponseEntity.ok(applicationService.saveApplication(applicantId,application));
    }

}
