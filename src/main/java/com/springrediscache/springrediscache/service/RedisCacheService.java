package com.springrediscache.springrediscache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

   

    @Cacheable(cacheNames = "mySpecialCache")
    public String longRunningMethod() throws InterruptedException{
        Thread.sleep(5000L);
        return "method calisti";
    }

    @Scheduled(fixedRate = 10000)
    @CacheEvict(cacheNames="mySpecialCache",allEntries = true)
    public void clearCache()throws InterruptedException{
        System.out.println("clean cache");
    }

    

    

    
}
