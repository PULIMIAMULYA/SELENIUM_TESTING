package testng1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest2 {
  @BeforeMethod
  public void login() {
	  System.out.println("login");
  }
  @Test
  public void operation() {
	  System.out.println("operation");
  }
  @AfterMethod
  public void close() {
	  System.out.println("close");
  }
}
