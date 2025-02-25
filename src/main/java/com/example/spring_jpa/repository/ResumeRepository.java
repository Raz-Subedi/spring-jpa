package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
