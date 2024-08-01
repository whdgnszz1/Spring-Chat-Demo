package jh.chatdemo.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/message")
    @SendTo("/topic/messages")
    public String sendMessage(String message) {
        return message;
    }

    @MessageMapping("/another")
    @SendTo("/topic/another")
    public String sendAnotherMessage(String message) {
        return message;
    }
}