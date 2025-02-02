package com.gym_app.gym_app_server.Repository.CustomUserProfile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym_app.gym_app_server.Modal.CustomUserProfile.CustomUserProfileModal;


@Repository
public interface CustomUserProfileRepository extends JpaRepository<CustomUserProfileModal,Integer> {
    
}
