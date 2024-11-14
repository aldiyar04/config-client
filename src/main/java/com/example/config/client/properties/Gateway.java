package com.example.config.client.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
@Data
public class Gateway {
    @Value("${gateway-api.url}")
    private String url;
    @Value("${gateway-api.username}")
    private String username;
    @Value("${gateway-api.password}")
    private String password;
    @Value("${gateway-api.timeout}")
    private Integer timeout;
}
