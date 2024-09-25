package org.company.service.service;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloWordServiceImpl {

    public ResponseEntity<String> checkStatus() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
