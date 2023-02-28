package com.example.azureappservicespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAppServiceSpringbootApplication {

    @GetMapping("/")
     public String getGreeting(){
        return "Welcome to Azure Web Service test";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzureAppServiceSpringbootApplication.class, args);
    }

}
