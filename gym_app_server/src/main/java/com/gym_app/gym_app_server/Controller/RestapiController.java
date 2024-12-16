package com.gym_app.gym_app_server.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestapiController {
    
    @GetMapping("/test")
     public String test(){
        return "Hello";
     }
}
