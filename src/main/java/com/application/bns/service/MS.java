package com.application.bns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("book-mss")
@Component
public interface MS {

    @RequestMapping("/greeting")
    public String greeting();
}
