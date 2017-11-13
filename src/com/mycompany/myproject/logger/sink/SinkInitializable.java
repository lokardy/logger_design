package com.mycompany.myproject.logger.sink;

public interface SinkInitializable<T extends SinkInitializationContext> {
	
	public void initSink(T  initializationContext);
}
