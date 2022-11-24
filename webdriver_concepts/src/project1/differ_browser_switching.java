package project1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class differ_browser_switching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.println("choose the browser:");
		String browser= c.next();
		
		switch(browser) {
		case "chrome":
			WebDriver d;
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			d= new ChromeDriver();
			d.get("https://www.amazon.com");
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			d.close();
			break;
			
		case "firefox":
			FirefoxDriver d1= new FirefoxDriver();
			d1.get("https://www.amazon.com");
			System.out.println(d1.getTitle());
			System.out.println(d1.getCurrentUrl());
			d1.close();
			break;
		default :
			System.out.println("Invalid browser");
		}

	}

}
