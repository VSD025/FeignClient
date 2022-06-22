package com.example.libraryfeignclient.controller;

import com.example.libraryfeignclient.feign.feignAuthorClient;
import com.example.libraryfeignclient.resource.AuthorResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
@Getter
@Setter
@Slf4j
public class AuthorController {
    private feignAuthorClient client;

    @GetMapping(path = "/author/{id}")
    AuthorResource getAuthor(@PathVariable Long id){
        AuthorResource response = client.getAuthor(id);
        log.info("Get author: id: {}, name: {}, surname: {} ", response.getId(),response.getName(),response.getSurname());
        return response;
    }

    @GetMapping(path = "/authors")
    List<AuthorResource> getAllAuthors(){
        log.info("Get all authors");
        return client.getAllAuthors();}
}
