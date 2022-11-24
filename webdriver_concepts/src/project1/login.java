package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		//d.findElement(By.linkText("New Tours")).click();
		//d.findElement(By.linkText("SIGN-ON")).click();
		//d.findElement(By.name("userName")).sendKeys("ammulu");
		//d.findElement(By.name("password")).sendKeys("Ammulu@2002");
		//d.findElement(By.name("submit")).click();
		d.findElement(By.xpath("//*[@name='userName']")).click();
		d.findElement(By.xpath("//input[@name='password']")).click();
		d.findElement(By.xpath("//input[@name='submit']")).click();
		
		

	}

}
