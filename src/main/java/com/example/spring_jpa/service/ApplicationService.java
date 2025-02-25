package com.example.spring_jpa.service;

import com.example.spring_jpa.entity.Applicant;
import com.example.spring_jpa.entity.Application;
import com.example.spring_jpa.repository.ApplicantJpaRepository;
import com.example.spring_jpa.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;

    public Application saveApplication(Long applicantId,Application application){
        Optional<Applicant> byId = applicantJpaRepository.findById(applicantId);
        if(byId.isPresent()) {
            Applicant applicant = byId.get();
            application.setApplicant(applicant);
            return applicationRepository.save(application);
        }else{
            throw new RuntimeException("Applicant not found with id " + applicantId);
        }
    }
}
