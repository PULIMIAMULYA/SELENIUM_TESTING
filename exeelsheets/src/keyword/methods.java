package keyword;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class methods {
	WebDriver d;

public void opening_browser() {
	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	 d= new ChromeDriver();
	 
  }
 public void navigate() {
	 d.get("https://demo.guru99.com/test/newtours/");
	 d.manage().window().maximize();
 }
 public void  usernameenter() {
	 d.findElement(By.name("userName"));
	 
 }
 public void passwordenter() {
	 d.findElement(By.name("password"));
 }
 public void click() {
	 d.findElement(By.name("submit")).click();
 }
 public void close() {
	 d.close();
 }
}
