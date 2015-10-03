package com.junit.basics.rules;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class MyCustomJunitRuleWillDeleteFiles implements TestRule{

	private List<File> deleteFiles; 
	
	private void cleanupFiles() {
		deleteFiles = new ArrayList<File>();
	}
	
	private void thisWillDeleteAllFiles() {
		for(File file:deleteFiles){
			if(file.exists()){
				file.delete();
			}
		}
	}
	
	public void addFilesToBeDeleted(String... filenames){
		for(String file:filenames){
			deleteFiles.add(new File(file));
		}
	}
	
	public Statement apply(final Statement base, Description description) {
		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {
				cleanupFiles();
				try{
					base.evaluate();
				}finally{
					thisWillDeleteAllFiles();
				}
			}
		};
	}

	
	
}