package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class workingongrid {
	//chrome
/*
	public static void main(String[] args) throws MalformedURLException {
		WebDriver d1;
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	    d1 = new RemoteWebDriver(new URL(nodeurl), cap);
		
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
	    d1=new ChromeDriver();
	    d1.get(baseurl);
	    d1.manage().window().maximize();
	    d1.close();
		 
		 */
	//firefox
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver d111;
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	    d111 = new RemoteWebDriver(new URL(nodeurl), cap);
		
	    d111= new FirefoxDriver();
		
	    d111.get(baseurl);
	    d111.manage().window().maximize();
	    d111.findElement(By.name("q")).sendKeys("manualtesting");
	    Thread.sleep(2000);
	    d111.findElement(By.name("btnG")).click();
	   
	    d111.close();
	}

}
