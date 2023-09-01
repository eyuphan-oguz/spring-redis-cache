package com.springrediscache.springrediscache.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrediscache.springrediscache.service.RedisCacheService;

@RestController
@RequestMapping("/test")
public class RedisCacheController {


    @Autowired
    private RedisCacheService redisCacheService;
    
    

    @GetMapping()
    public String cacheControl() throws InterruptedException{
       
        return redisCacheService.longRunningMethod();
    }

}
