package com.example.client.feign;

import com.example.client.resource.AuthorResource;
import com.example.client.resource.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "${feign.library.name}", url = "${feign.library.url}")
public interface feignClient {
    @GetMapping(path = "/author/{id}")
    AuthorResource getAuthor(@PathVariable long id);

    @GetMapping(path = "/authors")
    List<AuthorResource> getAllAuthors();
}
