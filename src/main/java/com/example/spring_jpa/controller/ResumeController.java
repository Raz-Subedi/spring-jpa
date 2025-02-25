package com.example.spring_jpa.controller;

import com.example.spring_jpa.entity.Resume;
import com.example.spring_jpa.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

//    @PostMapping("/{applicantId}/resume")
//    public ResponseEntity<Resume> addResume(@PathVariable long applicantId, @RequestBody Resume resume) {
//        return ResponseEntity.ok(resumeService.addResume(applicantId, resume));
//    }
}
