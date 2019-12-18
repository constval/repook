package com.constval.repook.service;


import com.constval.repook.repository.BookletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportBookletCreationService {

    @Autowired
    BookletRepository bookletRepository;

}
