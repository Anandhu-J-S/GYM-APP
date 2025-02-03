package com.gym_app.gym_app_server.Services.CustomUserProfile;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Repository.CustomUserProfile.CustomUserProfileRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserProfileServices {

    private final CustomUserProfileRepository customUserRepo;

    // Method to save the custom user profile
    public CustomUserProfileModal saveCustomUserProfile(CustomUserProfileModal customUserProfileModal){
        try {
            // Save and return the custom user profile
            return customUserRepo.save(customUserProfileModal);
        } catch (Exception e) {
            // Log or handle the exception
            // You could also throw a custom exception here
            throw new RuntimeException("Failed to save the user profile: " + e.getMessage());
        }
    }
}
