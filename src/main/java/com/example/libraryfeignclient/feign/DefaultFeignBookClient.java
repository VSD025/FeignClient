package com.example.libraryfeignclient.feign;

import com.example.libraryfeignclient.resource.BookResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultFeignBookClient implements feignBookClient{

    @Override
    public BookResource getBook(long id) {
        return new BookResource();
    }

    @Override
    public List<BookResource> getAllBooks() {
        return new ArrayList<>();
    }
}
