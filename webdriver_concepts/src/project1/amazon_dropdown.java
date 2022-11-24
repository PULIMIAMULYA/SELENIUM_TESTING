package project1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazon_dropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://www.amazon.com");
System.out.println(d.getTitle());
System.out.println(d.getCurrentUrl());
WebElement a= d.findElement(By.id("searchDropdownBox"));
List<WebElement> b=a.findElements(By.tagName("option"));
System.out.println("no of elements in dropdown:"+ b.size());
/*
for(int i=0;i<b.size();i++) {
	System.out.println("list of elements are:"+ b.get(i).getText());
}
*/

int i=0;
while(i<b.size()){
	
	System.out.println("list of elements are:"+ b.get(i).getText());
	i++;
	
}

File src =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("F:\\sscrenshots.png"));
	}

}
