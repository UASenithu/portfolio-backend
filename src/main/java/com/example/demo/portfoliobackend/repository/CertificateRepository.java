package com.example.demo.portfoliobackend.repository;

import com.example.demo.portfoliobackend.model.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}