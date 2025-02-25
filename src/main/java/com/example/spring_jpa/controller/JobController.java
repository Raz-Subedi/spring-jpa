package com.example.spring_jpa.controller;

import com.example.spring_jpa.entity.Applicant;
import com.example.spring_jpa.entity.Job;
import com.example.spring_jpa.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    @Autowired
    private JobService jobService;

    @PostMapping
    public ResponseEntity<Job> createJob(@RequestBody Job job) {
        Job createdJob = jobService.createJob(job);
        return ResponseEntity.ok(createdJob);
    }

    // Get all jobs
//   @GetMapping
//    public ResponseEntity<List<Job>> getAllJobs(){
//       List<Job> jobs = jobService.getAllJobs();
//        return ResponseEntity.ok(jobs);
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
//        Job job = jobService.getJobById(id);
//        return ResponseEntity.ok(job);
//    }

    @PostMapping("/add-job-to-applicant")
    public ResponseEntity<Applicant> addJobToApplicant(@RequestParam Long applicantId, @RequestParam Long jobId) {
        Applicant updatedApplicant = jobService.addJobToApplicant(applicantId, jobId);
        return ResponseEntity.ok(updatedApplicant);
    }
}
