package amazonpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login2 extends login{
  @Test(priority=3)
  public void dropdown() {
	  WebElement a=d.findElement(By.id("searchDropdownBox"));
	  List<WebElement> b= a.findElements(By.tagName("option"));
	  System.out.println(b.size());
	  for (int i=0;i<b.size();i++) {
		  System.out.println(b.get(i).getText());
	  }
  }
}
