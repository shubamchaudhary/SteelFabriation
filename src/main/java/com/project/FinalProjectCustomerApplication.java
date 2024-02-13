package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalProjectCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectCustomerApplication.class, args);
    }

    // Uncomment and modify this method if you need to run some specific code after application startup
    /*
    @Bean
    CommandLineRunner init(CategoryService categoryService, 
                           CustomerService customerService, 
                           ProductService productService, 
                           StaffService staffService) {
        return args -> {
            // Example initialization code
            // categoryService.create(new Category(...));
        };
    }
    */
}