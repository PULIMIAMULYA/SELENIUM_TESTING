package multipleclasses;

import org.testng.annotations.Test;

public class class3 extends class2{
	@Test(priority=6)
	  public void feedbackprocess() {
		  System.out.println("feedback sucessfully collected from customer");
	  }
	  @Test(priority=7)
	  public void close() {
		  System.out.println("window sucessfully closed");
	  }
	 
}
