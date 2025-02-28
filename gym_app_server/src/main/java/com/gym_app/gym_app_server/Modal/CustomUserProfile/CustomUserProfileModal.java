package com.gym_app.gym_app_server.Modal.CustomUserProfile;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "custom_user_profile")
public class CustomUserProfileModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int user_profile_id;
    private String user_profile_email;
    private int user_profile_height;
    private int user_profile_weight;

    @JsonFormat(pattern = "MM/dd/yy")    // 01/01/2025
    private LocalDate user_profile_dob;

    @Lob  // Store as binary large object (BLOB)
    private byte[] user_profile_image;  // This will store the image as a byte array

}
