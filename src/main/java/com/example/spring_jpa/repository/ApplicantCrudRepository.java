package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface ApplicantCrudRepository extends ListCrudRepository<Applicant, Long> {

}
