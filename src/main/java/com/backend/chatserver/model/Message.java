package com.backend.chatserver.model;

import com.backend.chatserver.Enum.Status;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {
	
	private String senderName;
	private String receiverName;
	private String message;
	private String date;
	private Status status;
	
	
	public Message() {
	}
	
	
	public Message(String senderName, String receiverName, String message, String date, Status status) {
		super();
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.message = message;
		this.date = date;
		this.status = status;
	}
	
	

}
