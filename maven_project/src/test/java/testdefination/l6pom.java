package testdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class l6pom {
	WebDriver d;
	@Given("user  in the newtours")
	public void user_in_the_newtours() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	}

	@When("user have to enter username and password")
	public void user_have_to_enter_username_and_password() {
		By uname=By.name("userName");
		By pass=By.name("password");
		d.findElement(uname).sendKeys("ammulu");
		d.findElement(pass).sendKeys("ammulu1");
	
	    
	}

	@Then("user clicked on the submit button")
	public void user_clicked_on_the_submit_button() throws InterruptedException {
		 d.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
	}

	@And("user nav to the homepage")
	public void user_nav_to_the_homepage() {
		  d.close();
	}

}
