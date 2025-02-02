package com.gym_app.gym_app_server.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym_app.gym_app_server.Modal.TestModal;
import com.gym_app.gym_app_server.Services.TestServices;

@RestController
@RequestMapping("/api")
public class TestController {

    private final TestServices testServices;

    public TestController(TestServices testServices) {
        this.testServices = testServices;
    }

    @GetMapping("/")
    public String test() {
        return "TestController Worked";
    }

    @PostMapping("/add-custom-user-profile")
    public TestModal addTestModal(@RequestBody TestModal testModal) {
        return testServices.saveTestModal(testModal);
    }

}
