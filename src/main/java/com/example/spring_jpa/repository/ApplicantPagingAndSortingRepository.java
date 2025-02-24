package com.example.spring_jpa.repository;

import com.example.spring_jpa.entity.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicantPagingAndSortingRepository extends ListPagingAndSortingRepository<Applicant, Long>, CrudRepository<Applicant, Long> {

}
