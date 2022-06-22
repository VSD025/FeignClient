package com.example.libraryfeignclient.feign;

import com.example.libraryfeignclient.resource.AuthorResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultFeignAuthorClient implements feignAuthorClient{
    @Override
    public AuthorResource getAuthor(long id) {
        return new AuthorResource();
    }

    @Override
    public List<AuthorResource> getAllAuthors() {
        return new ArrayList<AuthorResource>();
    }
}
