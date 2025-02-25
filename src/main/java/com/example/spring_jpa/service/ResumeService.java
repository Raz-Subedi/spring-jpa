package com.example.spring_jpa.service;

import com.example.spring_jpa.entity.Applicant;
import com.example.spring_jpa.entity.Resume;
import com.example.spring_jpa.repository.ApplicantJpaRepository;
import com.example.spring_jpa.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResumeService {

    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;

    @Autowired
    private ResumeRepository resumeRepository;

//    public Resume addResume(Long applicantId,Resume resume) {
//        Optional<Applicant> byId = applicantJpaRepository.findById(applicantId);
//        if(byId.isPresent()) {
//            Applicant applicant = byId.get();
//            resume.setApplicant(applicant);
//            return resumeRepository.save(resume);
//        }else{
//            throw new RuntimeException("Applicant not found with id " + applicantId);
//        }
//    }
}
