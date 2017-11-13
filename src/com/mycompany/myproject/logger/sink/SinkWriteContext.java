package com.mycompany.myproject.logger.sink;

import com.mycompany.myproject.logger.Message;

public class SinkWriteContext {

	private Message message;

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
