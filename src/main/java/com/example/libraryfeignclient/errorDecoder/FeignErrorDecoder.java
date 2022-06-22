package com.example.libraryfeignclient.errorDecoder;

import feign.Response;
import feign.codec.ErrorDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
@Slf4j
public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()){
            case 400: {
                log.error("Status code: {}, methodKey: {}", response.status(), methodKey);
            }
            case 404:
            {
                log.error("Feign client error occurred, status code: {}, methodKey: {}",response.status(),methodKey);
                return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Error occurred: status " + response.status());
            }
            default:
                return new Exception(response.reason());
        }
    }
}
