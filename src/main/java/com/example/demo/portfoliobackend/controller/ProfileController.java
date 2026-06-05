package com.example.demo.portfoliobackend.controller;

import com.example.demo.portfoliobackend.model.Profile;
import com.example.demo.portfoliobackend.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    // තියෙන Profile විස්තර ටික ගන්න
    @GetMapping
    public Profile getProfile() {
        return profileRepository.findById(1L).orElse(new Profile());
    }

    // විස්තර Update කරන්න
    @PostMapping("/update")
    public Profile updateProfile(@RequestBody Profile profile) {
        profile.setId(1L); // හැමතිස්සෙම 1 වෙනි Row එක Update වෙන්න
        return profileRepository.save(profile);
    }
}