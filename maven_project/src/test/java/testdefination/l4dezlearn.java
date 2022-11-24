package testdefination;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;

public class l4dezlearn {
	WebDriver d ;
	@Given("opening page")
	public void opening_page() {
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	}

	@When("user url and  title")
	public void user_url_and_title() {
	   System.out.println(d.getTitle());
	   System.out.println(d.getCurrentUrl());
	}

	@Then("user works on alert message")
	public void user_works_on_alert_message() {
	    d.findElement(By.id("s_alert1")).click();
	    Alert alt = d.switchTo().alert();
	    System.out.println(alt.getText());
	    alt.accept();
	}

	@And("user captures screen shot and closes the window")
	public void user_captures_screen_shot_and_closes_the_window() throws IOException {
		File src =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    Files.copy(src,new File("F:\\dezlearn.png"));
	    d.close();
	}

}
