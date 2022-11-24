package alerts_windows_frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {
	WebDriver d;
	Alert alt;
	public void opening_page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		}
	public String gettitle() {
		String a1= d.getTitle();
		return a1;
	}
	public String geturl() {
		String b1= d.getCurrentUrl();
		return b1;
		
	}
	public void click_the_button() {
		
		//WebElement click1 = d.findElement(By.id("confirmButton"));
		WebElement click1 = d.findElement(By.id("confirmButton"));
		click1.click();
		
	}
    public void changeto() throws InterruptedException {
    	
    	alt= d.switchTo().alert();
    	System.out.println(alt.getText());
    	Thread.sleep(2000);
    	alt.accept();
    	WebElement a= d.findElement(By.id("confirmResult"));
    	System.out.println(a.getText());
    	
    	//alt.dismiss();
    }
    public void close() {
    	d.close();
    }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
      alert2 a2= new alert2();
      a2.opening_page();
      System.out.println(a2.gettitle());
      System.out.println(a2.geturl());
      a2.click_the_button();
      a2.changeto();
      a2.close();
	} 

}
