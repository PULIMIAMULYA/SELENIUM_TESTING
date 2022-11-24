package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		d.findElement(By.id("nav-search-submit-button")).click();
		

	}

}
