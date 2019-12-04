package com.constval.repook.controller;

import com.constval.repook.model.Config;
import com.constval.repook.repository.BookletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CrossOrigin("http://localhost:8081") //does not work without on my local machine
@RestController
@RequestMapping("/api/config")
public class ConfigurationController {

    @Autowired
    private BookletRepository bookletRepository;

    @GetMapping("/all")
    public List<Config> getAllConfigs(){
        return bookletRepository.getAllConfigEntitys();
    }


}
