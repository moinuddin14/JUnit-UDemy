package com.junit.basics.rules;

import java.io.File;

import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TemporaryFile  extends File implements TestRule{
	
	private static final long serialVersionUID = 1L;
	private String fileName;
	
	TemporaryFile(String fileName){
		super(fileName);
		this.fileName=fileName;
	}
	public Statement apply(final Statement base, Description description) {
		
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				String[] files = fileName.toString().split("\\.");
				String extension = "\\."+files[1];
				File.createTempFile(files[0], extension);
				try {
					base.evaluate();
				}finally{
					
				}
			}
		};
	}
}