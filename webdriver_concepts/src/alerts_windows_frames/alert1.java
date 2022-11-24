package alerts_windows_frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
    WebDriver d;
		public void opening_site() {
			System.setProperty("webdriver.chrome.driver", "C://chromeDriver.exe");
			d=new ChromeDriver();
			d.get("https://demoqa.com/alerts");
			d.manage().window().maximize();
		}
		public void getTitle() {
			System.out.println(d.getTitle());
			}
		public void geturl() {
			System.out.println(d.getCurrentUrl());
		}
		public void click_alert_button() {
			d.findElement(By.id("alertButton")).click();
		}
		public void Switch_to_alert() throws InterruptedException {
			Alert alt= d.switchTo().alert();
			String text = alt.getText();
			Thread.sleep(2000);
			System.out.println(text);
			alt.accept();
		}
		public void close() {
			d.close();
		}
 public static void main(String[] args) throws InterruptedException {
	 alert1 a=new alert1();
	 a.opening_site();
	 a.getTitle();
	 a.geturl();
	 a.click_alert_button();
	 a.Switch_to_alert();
	 a.close();
 }
}
