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
}
