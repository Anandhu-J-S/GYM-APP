package com.gym_app.gym_app_server.ApiResponse;

import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ApiResponse {

    private String message;
    private boolean success;
    private CustomUserProfileModal customUserProfileModal;
    
}
//delete me later