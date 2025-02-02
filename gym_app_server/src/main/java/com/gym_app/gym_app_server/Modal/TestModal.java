package com.gym_app.gym_app_server.Modal;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class TestModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int ID;
    private String Name;
    private String Email;

    @JsonFormat(pattern = "MM/dd/yy")
    private  LocalDate DOB;
    
}
