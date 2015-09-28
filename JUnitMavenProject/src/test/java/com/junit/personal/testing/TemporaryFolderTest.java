package com.junit.personal.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
 
public class TemporaryFolderTest {
    
   @Rule
   public TemporaryFolder tempFolder = new TemporaryFolder();
   
   @Test
   public void testWrite() throws IOException, InterruptedException {
	   //Thread.sleep(10000);
	   System.out.println(tempFolder.getRoot().getAbsolutePath());
	   String pathToFile = tempFolder.getRoot().getAbsolutePath();
     // Create a temporary file.
     final File tempFile = tempFolder.newFile("tempFile.txt");
     System.out.println(tempFile.getAbsolutePath());
     // Write something to it.
     FileUtils.writeStringToFile(tempFile, "hello world");
   
     // Read it from temp file
     final String s = FileUtils.readFileToString(tempFile);
     System.out.println(s);
     // Verify the content
     Assert.assertEquals("hello world", s);
      System.out.println("Hola! It matches!");
     //Note: File is guaranteed to be deleted after the test finishes.
   }
 }