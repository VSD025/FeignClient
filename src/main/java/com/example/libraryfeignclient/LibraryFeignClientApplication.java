package com.example.libraryfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LibraryFeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryFeignClientApplication.class, args);
    }

}
