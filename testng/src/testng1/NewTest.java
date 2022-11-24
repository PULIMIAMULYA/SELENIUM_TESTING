package testng1;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver d;
  /*@Test(priority=1)*/
	@BeforeClass
  //@BeforeMethod
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
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
  @Test /*(priority=4*//*enabled=false)*/
  public void screenshot() throws IOException {
	  File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://testng.png"));
  }
  @AfterClass
  //@AfterMethod
  /*@Test(priority=5)*/
  public void close() {
	  d.close();
  }
}
