package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import javax.annotation.PostConstruct;

@Component
public class WebSocketClient {

    @PostConstruct
    public void connect() {
        StandardWebSocketClient client = new StandardWebSocketClient();
        client.doHandshake(new CustomWebSocketHandler(), "ws://localhost:8080/ws");
    }
}