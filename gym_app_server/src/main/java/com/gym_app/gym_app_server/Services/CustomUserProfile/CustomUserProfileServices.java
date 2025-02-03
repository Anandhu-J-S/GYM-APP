package com.gym_app.gym_app_server.Services.CustomUserProfile;

import org.springframework.stereotype.Service;

import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;
import com.gym_app.gym_app_server.Repository.CustomUserProfile.CustomUserProfileRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserProfileServices {

    //create custom user profile

    private final CustomUserProfileRepository  customUserRepo;



    public CustomUserProfileModal saveCustomUserProfile(CustomUserProfileModal customUserProfileModal){
        return customUserRepo.save( customUserProfileModal);

    }

   
}
