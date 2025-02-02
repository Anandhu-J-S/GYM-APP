package com.gym_app.gym_app_server.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym_app.gym_app_server.Modal.TestModal;
import com.gym_app.gym_app_server.Repository.TestRepository;

@Service
public class TestServices {


    private final TestRepository testRep;

    @Autowired
    public TestServices(TestRepository TestRep){
        this.testRep=TestRep;
    }

    public TestModal saveTestModal(TestModal testModal){
        return testRep.save(testModal);
    }


    
}
