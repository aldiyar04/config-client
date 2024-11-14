package com.example.config.client.controller;

import com.example.config.client.properties.Gateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class GatewayController {
    private final Gateway serviceParams;

    @PostMapping("/request")
    public String sendRequest() {
        log.info(serviceParams.toString());
        return serviceParams.toString();
    }
}
