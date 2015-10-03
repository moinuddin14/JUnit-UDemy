package com.junit.personal.testing;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.TemporaryFolder;

public class ClassRuleTemporaryFolderClass {
	
	@ClassRule
    public static TemporaryFolder testFolder = new TemporaryFolder();
	
	@ClassRule
	public static ExternalResource extResource = new ExternalResource() {
		@Override
		public void before() throws Throwable {
			System.out.println("Inside the Before method of External Resource");
		}
		
		@Override
		public void after() {
			System.out.println("Inside the After Method of External Resource");
		}
	};
	
    @BeforeClass   
    public static void testInTempFolder() throws IOException {
        File tempFile = testFolder.newFile("file.txt");
        File tempFolder = testFolder.newFolder("folder");
        System.out.println("Test folder: " + testFolder.getRoot().getAbsolutePath());
        System.out.println("Test File Path: "+tempFile.getAbsolutePath());
        System.out.println("New Test Folder Path: "+tempFolder);
        Assert.assertNotNull(testFolder.getRoot());
    }
 
    @Test
    public void test() throws IOException {
        File testFile = testFolder.newFile("Hello World");
        System.out.println("Test File Name in the test method: "+testFile);
    }
	
}