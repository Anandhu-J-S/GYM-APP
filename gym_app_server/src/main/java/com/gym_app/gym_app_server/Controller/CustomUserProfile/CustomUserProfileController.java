package com.gym_app.gym_app_server.Controller.CustomUserProfile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Services.CustomUserProfile.CustomUserProfileServices;


@RestController
@RequestMapping("/api")
public class CustomUserProfileController {

    private final CustomUserProfileServices customUserProfileServices;

    public CustomUserProfileController(CustomUserProfileServices customUserProfileServices){
        this.customUserProfileServices=customUserProfileServices;
    }

    @PostMapping("/save-custom-user-profile")
    public CustomUserProfileModal saveCustomUserProfileModal(@RequestBody CustomUserProfileModal customUserProfileModal){
        return customUserProfileServices.saveCustomUserProfile(customUserProfileModal);
    }

  
    
}
