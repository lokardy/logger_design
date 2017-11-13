package com.mycompany.myproject.logger;

import java.util.concurrent.ScheduledThreadPoolExecutor;

import com.mycompany.myproject.logger.configuration.LoggerConfiguration;
import com.mycompany.myproject.logger.configuration.LoggerConfigurationTemplate;
import com.mycompany.myproject.logger.sink.Sink;
import com.mycompany.myproject.logger.sink.SinkFactory;
import com.mycompany.myproject.logger.sink.SinkWriteContext;

public class DefaultLoggerImpl implements Logger {

	private LoggerConfiguration loggerConfiguration;

	@Override
	public void logMessage(Message message) {

		 
		 LoggerConfigurationTemplate loggerConfigurationTemplate = loggerConfiguration
				.findLoggerConfigurationByLogLevel(message.getLogLevel());

		Sink sink = SinkFactory.getSink(loggerConfigurationTemplate
				.getSinkInitializableContext());

		SinkWriteContext context = new SinkWriteContext();

		context.setMessage(message);

		sink.writeMessage(context);
	}

}
