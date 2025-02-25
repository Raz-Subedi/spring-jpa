package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
