package com.gym_app.gym_app_server.Services.CustomUserProfile;

import org.springframework.stereotype.Service;

import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Repository.CustomUserProfile.CustomUserProfileRepository;

@Service
public class CustomUserProfileServices {


    private final CustomUserProfileRepository  customUserRepo;

    public CustomUserProfileServices(CustomUserProfileRepository customUserRepo){
        this.customUserRepo=customUserRepo;
    }

    public CustomUserProfileModal saveCustomUserProfile(CustomUserProfileModal customUserProfileModal){
        return customUserRepo.save( customUserProfileModal);

    }

   
}
