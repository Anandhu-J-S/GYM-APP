package com.gym_app.gym_app_server.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym_app.gym_app_server.Modal.TestModal;

public interface TestRepository extends JpaRepository<TestModal,Integer> {
    
}
