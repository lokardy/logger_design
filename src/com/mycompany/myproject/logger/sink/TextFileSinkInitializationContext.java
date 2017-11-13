package com.mycompany.myproject.logger.sink;

public class TextFileSinkInitializationContext extends SinkInitializationContext {

	private String directory;
	
	private String fileName;


	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
