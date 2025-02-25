package com.example.spring_jpa.service;

import com.example.spring_jpa.entity.Applicant;
import com.example.spring_jpa.entity.Application;
import com.example.spring_jpa.entity.Resume;
import com.example.spring_jpa.repository.ApplicantCrudRepository;
import com.example.spring_jpa.repository.ApplicantJpaRepository;
import com.example.spring_jpa.repository.ApplicantPagingAndSortingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicantService {
    @Autowired
    private ApplicantCrudRepository applicantCrudRepository;

    @Autowired
    private ApplicantPagingAndSortingRepository applicantPagingAndSortingRepository;;

    @Autowired
    private ApplicantJpaRepository applicantJpaRepository;

    public List<Applicant> getALlApplicants() {
        return  applicantCrudRepository.findAll();
    }

    public Applicant saveApplicant(Applicant applicant) {
        Resume resume = applicant.getResume();
        if(resume != null) {
            resume.setApplicant(applicant);
        }
        List<Application> applications = applicant.getApplications();
        if(applications != null) {
            for(Application application : applications) {
                application.setApplicant(applicant);
            }
        }
        return applicantCrudRepository.save(applicant);
    }
    public Iterable<Applicant> getApplicantsWithPagination(int page, int size) {
        return applicantPagingAndSortingRepository.findAll(PageRequest.of(page, size));
    }

    public List<Applicant> getApplicantByStatus(String status) {
        return  applicantJpaRepository.findByStatusOrderByNameAsc(status);
    }

    public List<Applicant> getApplicantByPartialName(String name) {
        return  applicantJpaRepository.findApplicantsByPartialName(name);
    }
}
