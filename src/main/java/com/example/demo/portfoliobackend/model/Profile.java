package com.example.demo.portfoliobackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "profile_settings")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1L;

    private String name;
    private String subtitle;
    private String dpUrl;

    // අලුතින් එකතු කළ Fields ටික
    @Column(columnDefinition = "TEXT") // TEXT දාන්නේ ගොඩක් විස්තර ලියන්න පුළුවන් වෙන්න
    private String aboutMe;
    private String skills;
    private String contactDetails;
    private String education;

    // Getters and Setters (මේ ටිකත් අලුතින් Generate කරගන්න)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDpUrl() {
        return dpUrl;
    }

    public void setDpUrl(String dpUrl) {
        this.dpUrl = dpUrl;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}