package com.mycompany.myproject.logger;

import com.mycompany.myproject.logger.configuration.LoggerConfiguration;
import com.mycompany.myproject.logger.sink.Sink;
import com.mycompany.myproject.logger.sink.SinkWriteContext;

public class LoggerTimestampDecorator implements Logger {

	private LoggerConfiguration loggerConfiguration;
	
	private Logger delegatorLogger;
	
	
	@Override
	public void logMessage(Message message) {
		
		
	}


}
