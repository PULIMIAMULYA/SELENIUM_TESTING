package alerts_windows_frames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    WebDriver d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.dezlearn.com/iframe-example/");
		d.manage().window().maximize();
	    d.switchTo().frame("iframe1");
	    d.findElement(By.id("u_5_6")).click();
	    String a= d.findElement(By.id("processing")).getText();
	    System.out.println(a);
	   
		
		

	}

}
