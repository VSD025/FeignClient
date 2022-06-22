package com.example.libraryfeignclient.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookResource {

    @JsonProperty(value = "id")
    private long id;

    @JsonProperty (value = "title")
    private String title;

    @JsonProperty (value = "author_id")
    private long author_id;
}