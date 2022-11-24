package project1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class condition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d;
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		d.getTitle();
		d.getCurrentUrl();
	    d.findElement(By.id("searchDropdownBox")).sendKeys("DigitalMusic");
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("vocalists");
	    d.findElement(By.id("nav-search-submit-button")).click();
	    WebElement a= d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[19]/div/div/span"));
	    List<WebElement>b=a.findElements(By.tagName("span"));
	    System.out.println(b.size());
	    for (int i=0;i<b.size();i++) {
	    	System.out.println(b.get(i).getText());
			b.get(i).click();
			Thread.sleep(3000);
	    	d.navigate().back();
	    	d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[19]/div/div/span"));
	    	b=a.findElements(By.tagName("span"));
		 }
		
		/*
		
		boolean sele=d.findElements(By.id("nav-search-submit-button")).isEmpty();
		System.out.println(sele);
		boolean dis = d.findElement(By.id("searchDropdownBox")).isDisplayed();
		System.out.println(dis);
		boolean ena= d.findElement(By.id("searchDropdownBox")).isEnabled();
		System.out.println(ena);
	
      */
		
		
		

	}

}
