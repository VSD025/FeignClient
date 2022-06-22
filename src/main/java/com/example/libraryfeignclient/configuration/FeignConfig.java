package com.example.libraryfeignclient.configuration;

import org.apache.http.Header;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.List;

@Configuration
public class FeignConfig {

    @Bean
    public CloseableHttpClient feignClient() {
        CloseableHttpClient httpClient = null;
        try {
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(15000)
                    .setConnectionRequestTimeout(15000)
                    .build();

            Header header = new BasicHeader("Test", "Test");
            Collection<Header> headers = List.of(header);
            httpClient =  HttpClients.custom()
                    .setDefaultRequestConfig(requestConfig)
                    .setDefaultHeaders(headers)
                    .build();
        }
        catch (RuntimeException e){
            System.err.println("Exception : " + e.getMessage());
        }
        return httpClient;
    }

}
