package com.ws.test.stevenws.dev;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Slf4j
@Component
public class SocketHandler extends TextWebSocketHandler {
    List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)
            throws InterruptedException, IOException {
        log.info("session ->> " + session.toString() + " message ->> " + message.toString());
        for (WebSocketSession webSocketSession : sessions) {
            if (webSocketSession.isOpen()) {
                //&& !session.getId().equals(webSocketSession.getId())

                log.info("message ->> " + message.toString());

                webSocketSession.sendMessage(message);
            }
        }
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("session ->> " + session.toString());
        sessions.add(session);
    }
}
