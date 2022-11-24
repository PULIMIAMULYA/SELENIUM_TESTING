package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
ChromeDriver d=new ChromeDriver();
//opening page
d.get("https://www.amazon.com");
//maximizing window
d.manage().window().maximize();
//to get a title of the page
System.out.println(d.getTitle());
//to get the current url
System.out.println(d.getCurrentUrl());
//
d.findElement(By.id("searchDropdownBox")).sendKeys("deals");
d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
d.findElement(By.id("nav-search-submit-button")).click();
boolean Selected = d.findElement(By.id("nav-search-submit-button")).isSelected();
System.out.println(Selected);
boolean displayed = d.findElement(By.id("nav-search-submit-button")).isDisplayed();
System.out.println(displayed);
boolean enabled = d.findElement(By.id("nav-search-submit-button")).isEnabled();
System.out.println(enabled);
	}

}

