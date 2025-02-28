package com.gym_app.gym_app_server.Services.CustomUserProfile;

import org.springframework.stereotype.Service;
import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Repository.CustomUserProfile.CustomUserProfileRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserProfileServices {

    private final CustomUserProfileRepository customUserRepo;

    // Method to save or update custom user profile
    public CustomUserProfileModal saveCustomUserProfile(CustomUserProfileModal customUserProfileModal) {
        try {
            return customUserRepo.save(customUserProfileModal);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save the user profile: " + e.getMessage());
        }
    }

    // Method to get a custom user profile by ID
    public CustomUserProfileModal getCustomUserProfile(int id) {
        return customUserRepo.findById(id).orElse(null);
    }

    // Method to delete a custom user profile
    public void deleteCustomUserProfile(int id) {
        CustomUserProfileModal profile = customUserRepo.findById(id).orElse(null);
        if (profile != null) {
            customUserRepo.delete(profile);
        } else {
            throw new RuntimeException("Profile not found");
        }
    }
}
