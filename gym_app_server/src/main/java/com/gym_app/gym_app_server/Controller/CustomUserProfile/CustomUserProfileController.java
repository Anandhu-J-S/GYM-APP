package com.gym_app.gym_app_server.Controller.CustomUserProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym_app.gym_app_server.ApiResponse.ApiResponse;
import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Services.CustomUserProfile.CustomUserProfileServices;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CustomUserProfileController {

    private final CustomUserProfileServices customUserProfileServices;

    // Endpoint to save the custom user profile
    @PostMapping("/save-custom-user-profile")
    public ApiResponse saveCustomUserProfileModal(@RequestBody CustomUserProfileModal customUserProfileModal){
        try {
            // Attempt to save the custom user profile
            CustomUserProfileModal savedProfile = customUserProfileServices.saveCustomUserProfile(customUserProfileModal);
            
            // Return success message along with the saved profile
            return new ApiResponse("Successfully created user", true, savedProfile);
        } catch (Exception e) {
            // Handle any errors and return a failure response
            return new ApiResponse("Error occurred while creating user: " + e.getMessage(), false, null);
        }
    }
}
