package com.example.client.feign;

import com.example.client.resource.AuthorResource;
import com.example.client.resource.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultFeignClient implements feignClient{
    @Override
    public AuthorResource getAuthor(long id) {
        return new AuthorResource();
    }

    @Override
    public List<AuthorResource> getAllAuthors() {
        return new ArrayList<AuthorResource>();
    }
}
