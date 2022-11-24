package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class countries {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		d.findElement(By.linkText("REGISTER")).click();
	    WebElement a=d.findElement(By.name("country"));
	    List<WebElement> b=a.findElements(By.tagName("option"));
	    System.out.println(b.size());
	    for(int i=0;i<b.size();i++) {
	    	System.out.println(b.get(i).getText());
	    }
	    File src =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("F:\\sscreenshots\\register.png"));
	   
	}
	  
}
