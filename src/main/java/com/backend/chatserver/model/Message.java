package com.backend.chatserver.model;

import com.backend.chatserver.Enum.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

@Document(collection = "messages")
public class Message {

    @Id
    private String id;
    private String senderName;
    private String receiverName;
    private String message;
    private LocalDateTime date; 
    private Status status;

    public Message() {
        this.date = LocalDateTime.now();
    }

    public Message(String senderName, String receiverName, String message, Status status) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.message = message;
        this.status = status;
        this.date = LocalDateTime.now();
    }
}
