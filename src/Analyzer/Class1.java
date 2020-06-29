package Analyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 
{
  @Test
  public void f() 
  {
   System.out.println("Test1");
  }
  @Test
  public void g() 
  {
	  Assert.assertTrue(false);
	  System.out.println("Test2");
  }
  @Test
  public void h() 
  {
	  System.out.println("Test3");
  }  
}