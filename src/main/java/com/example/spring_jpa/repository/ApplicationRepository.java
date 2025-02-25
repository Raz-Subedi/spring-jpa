package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
