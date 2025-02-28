package com.gym_app.gym_app_server.Controller.CustomUserProfile;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.gym_app.gym_app_server.ApiResponse.ApiResponse;
import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Services.CustomUserProfile.CustomUserProfileServices;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomUserProfileController {

    private final CustomUserProfileServices customUserProfileServices;

    @PostMapping("/save-custom-user-profile")
    public ApiResponse saveCustomUserProfile(
            @RequestParam String email, 
            @RequestParam int height, 
            @RequestParam int weight, 
            @RequestParam String dob, 
          @RequestParam MultipartFile image) {
            System.out.println("Received request to save user profile: " + email);
        try {
            CustomUserProfileModal profile = new CustomUserProfileModal(
                0, 
                email, 
                height, 
                weight, 
                LocalDate.parse(dob), 
                image.getBytes() // directly convert image
            );

            CustomUserProfileModal savedProfile = customUserProfileServices.saveCustomUserProfile(profile);

            return new ApiResponse("Successfully created user", true, savedProfile);
        } catch (Exception e) {
            return new ApiResponse("Error occurred: " + e.getMessage(), false, null);
        }
    }

    
    @GetMapping("/get-custom-user-profile/{id}")
    public ApiResponse getCustomUserProfile(@PathVariable int id) {
        try {
            CustomUserProfileModal profile = customUserProfileServices.getCustomUserProfile(id);
            if (profile != null) {
                return new ApiResponse("Profile retrieved successfully", true, profile);
            } else {
                return new ApiResponse("Profile not found", false, null);
            }
        } catch (Exception e) {
            return new ApiResponse("Error occurred: " + e.getMessage(), false, null);
        }
    }
    
    // Update API: Update custom user profile
    @PutMapping("/update-custom-user-profile/{id}")
    public ApiResponse updateCustomUserProfile(
            @PathVariable int id,
            @RequestParam String email, 
            @RequestParam int height, 
            @RequestParam int weight, 
            @RequestParam String dob, 
            @RequestParam MultipartFile image) {
        
        try {
            CustomUserProfileModal existingProfile = customUserProfileServices.getCustomUserProfile(id);

            if (existingProfile == null) {
                return new ApiResponse("Profile not found", false, null);
            }

            existingProfile.setUser_profile_email(email);
            existingProfile.setUser_profile_height(height);
            existingProfile.setUser_profile_weight(weight);
            existingProfile.setUser_profile_dob(LocalDate.parse(dob));
            existingProfile.setUser_profile_image(image.getBytes()); // Update image
            
            CustomUserProfileModal updatedProfile = customUserProfileServices.saveCustomUserProfile(existingProfile);
            return new ApiResponse("Profile updated successfully", true, updatedProfile);
        } catch (Exception e) {
            return new ApiResponse("Error occurred: " + e.getMessage(), false, null);
        }
    }

    // Delete API: Delete custom user profile
    @DeleteMapping("/delete-custom-user-profile/{id}")
    public ApiResponse deleteCustomUserProfile(@PathVariable int id) {
        try {
            CustomUserProfileModal existingProfile = customUserProfileServices.getCustomUserProfile(id);

            if (existingProfile != null) {
                customUserProfileServices.deleteCustomUserProfile(id);
                return new ApiResponse("Profile deleted successfully", true, null);
            } else {
                return new ApiResponse("Profile not found", false, null);
            }
        } catch (Exception e) {
            return new ApiResponse("Error occurred: " + e.getMessage(), false, null);
        }
    }


}
