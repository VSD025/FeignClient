package com.example.client.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Response {
    private final String message;
    private final LocalDateTime timestamp;
    private final int status;
    private final Object data;
}
