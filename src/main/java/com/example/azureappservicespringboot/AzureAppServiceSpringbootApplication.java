package com.example.azureappservicespringboot;

import com.example.azureappservicespringboot.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class AzureAppServiceSpringbootApplication {

    @GetMapping("/")
     public String getGreeting(){
        return "Successfully created CI/CD pipeline...";
    }
   @GetMapping("/products")
   public List<Product> getProductDetails(){
       return Arrays.asList(new Product("Spring",5l,400.00),
               new Product("Spring",8l,500.00),
               new Product("Roon",9l,100));
   }



    public static void main(String[] args) {
        SpringApplication.run(AzureAppServiceSpringbootApplication.class, args);
    }

}
