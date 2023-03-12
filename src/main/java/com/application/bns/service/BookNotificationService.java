package com.application.bns.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("book-ms")
@Component
public interface BookNotificationService {

    @RequestMapping("/bookCount")
    public String bookCount();
    @RequestMapping("/book/greeting")
    public String getGreeting();
}
