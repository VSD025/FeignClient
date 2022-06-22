package com.example.libraryfeignclient.feign;

import com.example.libraryfeignclient.resource.AuthorResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "${feign.library.name.author}", url = "${feign.library.url}")
public interface feignAuthorClient {
    @GetMapping(path = "/author/{id}")
    AuthorResource getAuthor(@PathVariable long id);

    @GetMapping(path = "/authors")
    List<AuthorResource> getAllAuthors();
}
