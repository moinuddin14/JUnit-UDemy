package com.junit.basics.rules;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;

public class ImplMyCustomJunitRuleWillDeleteFiles {

	
	@Rule
	public MyCustomJunitRuleWillDeleteFiles rule = new MyCustomJunitRuleWillDeleteFiles();
	
	@Test
	public void deleteFilesMethod() throws IOException, InterruptedException{
		
		File temp1 = File.createTempFile("temp1", ".txt");
		File temp2 = File.createTempFile("temp2", ".txt");
		System.out.println(temp1.getAbsolutePath());
		System.out.println(temp2.getAbsolutePath());
		rule.addFilesToBeDeleted(temp1.getAbsolutePath(), temp2.getAbsolutePath());
		Thread.sleep(5000);
	}
	
}