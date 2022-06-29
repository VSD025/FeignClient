package com.example.libraryfeignclient.controller;

import com.example.libraryfeignclient.feign.feignBookClient;
import com.example.libraryfeignclient.resource.BookResource;
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
public class BookController {
    private feignBookClient client;

    @GetMapping(path = "/book/{id}")
    BookResource getAuthor(@PathVariable Long id){
        BookResource response = client.getBook(id);
        log.info("Get book: id: {}, title: {}, author_id: {} ", response.getId(),response.getTitle(),response.getAuthor_id());
        return response;
    }

    @GetMapping(path = "/books")
    List<BookResource> getAllAuthors(){
        log.info("Get all books");
        return client.getAllBooks();}
}
