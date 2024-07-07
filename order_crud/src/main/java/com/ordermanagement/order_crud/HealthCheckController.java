package com.ordermanagement.order_crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    

    @GetMapping("/healthCheck")
    public String healthCheckEntity() {
        return "health is OK";
    }
}
