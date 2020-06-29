package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalyzer implements IRetryAnalyzer
{
	int counter=0;
	int maxlimit=3;
  
  public boolean retry(ITestResult result) 
  {
	  if(counter<maxlimit)
	  {
		  counter=counter+1;
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }
}
