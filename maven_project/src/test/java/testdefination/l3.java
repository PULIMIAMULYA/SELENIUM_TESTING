package testdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class l3 {
	WebDriver d;

@Given("user is on newtours page")
public void user_is_on_newtours_page() {
	System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	d= new ChromeDriver();
	d.get("https://demo.guru99.com/test/newtours/login.php");
	d.manage().window().maximize();
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
   
}

@When("^user specifies (.*)and (.*)$")
public void user_specifies_username_and_password(String uname, String password) {
	d.findElement(By.name("userName")).sendKeys(uname);
	d.findElement(By.name("password")).sendKeys(password);
	
}

@Then("user click on the submit button")
public void user_click_on_the_submit_button() {
	d.findElement(By.name("submit")).click();
}

@And("user back to home page")
public void user_back_to_home_page() {
	System.out.println("home page");
	d.navigate().to("https://demo.guru99.com/test/newtours/login.php");
	
}

}
