package com.example.spring_jpa.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String phone;
    private String status;

    @OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
    private Resume resume;

    @OneToMany(mappedBy = "applicant",cascade = CascadeType.ALL)
    private List<Application> applications = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "applicants_jobs",
            joinColumns = @JoinColumn(name = "applicantId"),
            inverseJoinColumns = @JoinColumn(name = "jobId")
    )
    private List<Job> jobs = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
