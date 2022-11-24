package testng1;

import org.testng.annotations.Test;

public class program1 {
  @Test(priority=1)
  public void opening_browser() {
	 System.out.println("application successfully opened");
  }
  @Test(priority=2)
  public void Customerdetails() {
	  System.out.println("customer details sucessfully updated");
  }
  @Test(priority=3)
  public void productdetails() {
	  System.out.println("product is succesfully updated");
  }
  @Test (priority=4)
  public void paymentdetails() {
	  System.out.println("payment done through credit card");
  }
  @Test(priority=5)
  public void deliveryprocess() {
	  System.out.println("deliverd to right address");
  }
  @Test/*(priority=6)*/(enabled=false)
  public void feedbackprocess() {
	  System.out.println("feedback sucessfully collected");
}
  @Test(priority=7)
  public void logoff() {
	  System.out.println("application sucessfully closed");
}
}
