package com.learning.microservices.currencyexchangeservice;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CircuitBreakerController {

    private Logger logger =
            LoggerFactory.getLogger(CircuitBreakerController.class);
    @GetMapping("/sample-api")
    //@Retry(name="default")
    //@Retry(name="sample-api")
    //@Retry(name = "sample-api", fallbackMethod = "hardcodedResponse")
    //@CircuitBreaker(name="default", fallbackMethod = "hardcodedResponse")
    //@RateLimiter(name="default")
    //@Bulkhead(name="default")
    @Bulkhead(name="sample-api")
    public String sampleApi(){
        logger.info("Sample api call received");
       // ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/dummy-url", String.class);
       // return forEntity.getBody();
        return "sample-api";
    }

    public String hardcodedResponse(Exception ex) {
        return "fallback-response";
    }
}
