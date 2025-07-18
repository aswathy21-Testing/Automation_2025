package testngcode;

import org.testng.annotations.Test;

public class TestngFirstProgram {
  @Test(priority = 2)
  public void firstMethod() {
	  System.out.println("Hello World");
  }
  
  @Test(priority = 1)
  public void secondMethod() {
	  System.out.println("Aswathy");
  }
}
