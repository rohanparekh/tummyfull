package com.tummyfull.tummyfull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tummyfull")
public class TummyfullApplication {

    public static void main(String[] args) {
        SpringApplication.run(TummyfullApplication.class, args);
    }

}
