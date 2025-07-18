package testngcode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Annotations {
  @Test
  public void f() {
	  System.out.println("Annotations");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }
  @Test
  public void display() {
	  System.out.println("Aswathy");
  }
  @Test
  public void showName() {
	  System.out.println("Vijayan");
  }
  

}
