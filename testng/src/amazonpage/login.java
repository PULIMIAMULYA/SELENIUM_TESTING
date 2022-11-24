package amazonpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	WebDriver d;
  @BeforeTest
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void title() {
	  System.out.println(d.getTitle());
  }
  @Test(priority=2)
  public void url() {
	  System.out.println(d.getCurrentUrl());
	  
  }
}
