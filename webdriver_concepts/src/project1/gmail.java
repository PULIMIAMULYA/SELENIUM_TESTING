package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		WebDriver d;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.google.com");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		*/
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.linkText("Gmail")).click();
		d.navigate().back();
        Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(1000);
		d.navigate().back();
		Thread.sleep(1000);
		d.close();
	}

}
