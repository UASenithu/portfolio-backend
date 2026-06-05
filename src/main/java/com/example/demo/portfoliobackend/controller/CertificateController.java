package com.example.demo.portfoliobackend.controller;

import com.example.demo.portfoliobackend.model.Certificate;
import com.example.demo.portfoliobackend.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/certificates")
public class CertificateController {

    @Autowired
    private CertificateRepository certificateRepository;

    // 1. React Web එකටයි Flutter එකටයි ඔක්කොම Certificates බලන්න
    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    // 2. Flutter Admin App එකෙන් අලුත් Certificate එකක් ඇඩ් කරන්න
    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    // 3. ඕන නම් Certificate එකක් Delete කරන්න
    @DeleteMapping("/{id}")
    public String deleteCertificate(@PathVariable Long id) {
        certificateRepository.deleteById(id);
        return "Certificate deleted successfully!";
    }
}