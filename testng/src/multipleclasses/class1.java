package multipleclasses;

import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("welcome to newtours");
  }
  @Test(priority=2)
  public void customerdetails() {
	  System.out.println("customer details are succesfully updated");
  }
  @Test(priority=3)
  public void productdetails() {
	  System.out.println("product details are succesfully updated");
  }
}
