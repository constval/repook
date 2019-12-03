package com.constval.repook.service;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ReportBookletCreationService {

    @RequestMapping( path = "/")
    public Object greeting(){
        return "test";
    }

}
