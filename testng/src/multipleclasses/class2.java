package multipleclasses;

import org.testng.annotations.Test;

public class class2 extends class1{
	@Test(priority=4)
	  public void paymentdetails() {
		  System.out.println("paymentdetails");
	  }
	  @Test(priority=5)
	  public void paiddetails() {
		  System.out.println("paiddetails");
	  }
	 
  
}
