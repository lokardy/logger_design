package com.mycompany.myproject.logger;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.mycompany.myproject.logger.configuration.LoggerConfiguration;
import com.mycompany.myproject.logger.configuration.LoggerConfigurationTemplate;
import com.mycompany.myproject.logger.sink.Sink;
import com.mycompany.myproject.logger.sink.SinkFactory;
import com.mycompany.myproject.logger.sink.SinkWriteContext;
public class LoggerWriteTask<V>  implements Callable<Void>{
	
	
	
	public LoggerWriteTask(LoggerConfiguration loggerConfiguration,
			Message currentmessage) {
		super();
		this.loggerConfiguration = loggerConfiguration;
		this.currentmessage = currentmessage;
	}

	private LoggerConfiguration loggerConfiguration;
	
	private Message currentmessage;
	
	@Override 
	public Void call() throws Exception {
		
		 LoggerConfigurationTemplate loggerConfigurationTemplate = loggerConfiguration
					.findLoggerConfigurationByLogLevel(currentmessage.getLogLevel());

			Sink sink = SinkFactory.getSink(loggerConfigurationTemplate
					.getSinkInitializableContext());

			SinkWriteContext context = new SinkWriteContext();

			context.setMessage(currentmessage);

			sink.writeMessage(context);
			
			return null;
	}

}
