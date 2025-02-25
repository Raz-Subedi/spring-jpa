package com.example.spring_jpa.service;

import com.example.spring_jpa.entity.Applicant;
import com.example.spring_jpa.entity.Job;
import com.example.spring_jpa.repository.ApplicantJpaRepository;
import com.example.spring_jpa.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;

    public Job createJob(Job job){
        return jobRepository.save(job);
    }

    public Applicant addJobToApplicant(Long applicantId, Long jobId){
        Optional<Applicant> applicant = applicantJpaRepository.findById(applicantId);
        Optional<Job> job = jobRepository.findById(jobId);

        if(applicant.isPresent() && job.isPresent()){
            applicant.get().getJobs().add(job.get());
            applicantJpaRepository.save(applicant.get());
            return applicant.get();
        }else{
            throw new IllegalArgumentException("Applicant or Job not found");
        }
    }
}
