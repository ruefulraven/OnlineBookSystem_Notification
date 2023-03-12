package com.application.bns.controller;

import com.application.bns.service.BookNotificationService;
import com.application.bns.service.MS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.discovery.EurekaClient;

@RestController
@EnableFeignClients
public class BookNoticationController {

    @Autowired
    BookNotificationService bookNotificationService;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/bookCount")
    public String getBookCount(){
        return bookNotificationService.bookCount();
    }

    @GetMapping("/get-greeting")
    public String getGreeting(){
        return bookNotificationService.getGreeting();
    }


}
