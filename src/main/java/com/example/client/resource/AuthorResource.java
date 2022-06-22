package com.example.client.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AuthorResource {

    @JsonProperty (value = "id")
    private long id;

    @JsonProperty (value = "name")
    private String name;

    @JsonProperty (value = "surname")
    private String surname;

}
