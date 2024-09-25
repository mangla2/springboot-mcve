package org.company.service.controller;

import org.company.service.annotation.ValidateAuthToken;
import org.company.service.service.HelloWordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldService {

    @Autowired
    private HelloWordServiceImpl helloWordService;

    @ValidateAuthToken
    @GetMapping("/check/health")
    public ResponseEntity<String> checkStatus() {
        return helloWordService.checkStatus();
    }
}
