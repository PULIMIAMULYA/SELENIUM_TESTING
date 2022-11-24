package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest3 {
  @BeforeClass
  public void login() {
	  System.out.println("login2");
  }
  @Test
  public void operation() {
	  System.out.println("op2");
  }
  @AfterClass
  public void close() {
	  System.out.println("close2");
  }
}
