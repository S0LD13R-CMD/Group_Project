package com.qmul.messaging.app.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "global-messages")
public class GlobalMessage {

    @Id
    private String id;
    private String content;
    private String sender_id;
    private String timestamp;

    public GlobalMessage() {}

    public GlobalMessage(String content, String sender_id, String timestamp) {
        this.content = content;
        this.sender_id = sender_id;
        this.timestamp = timestamp;
    }
}
