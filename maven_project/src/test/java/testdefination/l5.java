package testdefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class l5 {
	WebDriver d;
	@Given("user is in newtours")
	public void user_is_in_newtours() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	    
	}

	@When("user needs to enter username and password")
	public void user_needs_to_enter_username_and_password() throws IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Amulya pulimi\\eclipse-workspace\\perfect\\src\\test\\java\\testdefination\\p1.properties");
		Properties p1=new Properties();
		p1.load(f1);
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	
	    
	}

	@Then("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	    d.findElement(By.name("submit"));
	}

	@And("user navigates to the homepage")
	public void user_navigates_to_the_homepage() {
	   //d.navigate().back();
	   d.close();
	}

}

