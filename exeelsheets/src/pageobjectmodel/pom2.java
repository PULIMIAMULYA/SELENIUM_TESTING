package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2 {
	WebDriver d;
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By phone=By.name("phone");
	By Uname=By.name("userName");
	By Country=By.name("country");
	By sub=By.name("submit");
	
	pom2(WebDriver d){
		this.d=d;
	}
	public void firstname() {
		d.findElement(Fname).sendKeys("abc");
	}
	public void lastname() {
		d.findElement(Lname).sendKeys("cde");
	}
	public void phone() {
		d.findElement(phone).sendKeys("9346551376");
	}
	public void uname() {
		d.findElement(Uname).sendKeys("ammu");
	}
	public void country() {
		d.findElement(Country).sendKeys("india");
	}
	public void submit() {
		d.findElement(sub).click();
	}
	

	

}
