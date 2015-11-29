package com.dcalabresi.momentous.back;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableSwagger
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
