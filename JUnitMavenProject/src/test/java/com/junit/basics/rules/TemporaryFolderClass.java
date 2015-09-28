package com.junit.basics.rules;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderClass {

	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();
	
	@Test
	public void testingTemporaryFolderRule() throws Exception{
		Thread.sleep(5000);
		System.out.println(tempFolder.getRoot().getAbsolutePath());
		
		File file = tempFolder.newFile("tempFile");
		
		System.out.println(file.getAbsolutePath());
		
		FileUtils.writeStringToFile(file, "Hello World!");
		
		String str = FileUtils.readFileToString(file);
		
		Assert.assertEquals("Hello World!", str);
		System.out.println("Hola! The Strings are equal");
		//throw new Exception("testException");
	}
	
}