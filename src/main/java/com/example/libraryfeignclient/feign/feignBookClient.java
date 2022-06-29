package com.example.libraryfeignclient.feign;

import com.example.libraryfeignclient.configuration.FeignConfig;
import com.example.libraryfeignclient.resource.BookResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "${feign.library.name.book}", url = "${feign.library.url}", configuration = FeignConfig.class)
public interface feignBookClient {
    @GetMapping(path = "/book/{id}")
    BookResource getBook(@PathVariable long id);

    @GetMapping(path = "/books")
    List<BookResource> getAllBooks();
}