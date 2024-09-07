package com.edwin.chat.chat;

import lombok.*;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public MessageType getType() {
        return Type;
    }

    public void setType(MessageType type) {
        Type = type;
    }

    private String Content;
    private String Sender;
    private MessageType Type;
}
