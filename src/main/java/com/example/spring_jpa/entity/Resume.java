package com.example.spring_jpa.entity;

import jakarta.persistence.*;

@Entity
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String content;

    @JoinColumn(name = "applicantId",nullable = false)
    private Applicant applicant;
}
