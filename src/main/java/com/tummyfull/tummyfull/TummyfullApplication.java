package com.tummyfull.tummyfull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan({"com.tummyfull.model","com.tummyfull.api","com.tummyfull.dao"})
public class TummyfullApplication {

    public static void main(String[] args) {
        SpringApplication.run(TummyfullApplication.class, args);
    }

}
