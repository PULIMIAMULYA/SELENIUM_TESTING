package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d;
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.linkText("Gmail")).click();
		
	}

}
