package testdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class frameworkl7 {
	WebDriver d;
	@Given("user opens new tour site")
	public void user_opens_new_tour_site() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d= new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.getTitle();
		d.getCurrentUrl();
	}

	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
	    d.findElement(By.linkText("REGISTER"));
	}

	@Then("user needs to get country names from dropdown")
	public void user_needs_to_get_country_names_from_dropdown() {
		WebElement a = d.findElement(By.name("country"));
		List<WebElement> b= a.findElements(By.linkText("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i).getText());
		}
		
	    
	}

	@And("user navigate back to home page")
	public void user_navigate_back_to_home_page() {
	    
	}

	@And("user closes the page")
	public void user_closes_the_page() {
	    
	}


}
