package com.junit.basics.rules;

import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TemporaryFolder;

public class FolderRuleOrderingTest {

	@Rule
  public TemporaryFolder folder = new TemporaryFolder();
  //assume, we have a rule that creates a testfile in a temporary folder
  //we create a dependency relationship between file and folder,
  //so that file depends on folder
	
	@Rule
  public TemporaryFile file = new TemporaryFile("temp.txt");

  //the rule chain ensures, the temporary folder is created before and removed 
  //after the testfile has been created and deleted (or whatever)
  @Rule
  public RuleChain chain= RuleChain.outerRule(folder).around(file);

  @Test
  public void testFileExist() throws IOException {
    //System.out.println(file.getAbsolutePath());
  }
}