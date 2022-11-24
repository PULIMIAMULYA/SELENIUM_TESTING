package alerts_windows_frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabs {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver d;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_ids = d.getWindowHandle();
		System.out.println(parent_ids);
		d.findElement(By.id("tabButton")).click();
		Set<String> child_ids = d.getWindowHandles();
		System.out.println(child_ids);
		for(String handles : child_ids) {
			if(!handles.equalsIgnoreCase(parent_ids)){
			d.switchTo().window(handles);
			d.manage().window().maximize();
			String s= d.findElement(By.id("sampleHeading")).getText();
			System.out.println(s);
			d.close();
			}
		}
		d.switchTo().window(parent_ids);
		Thread.sleep(2000);
		d.close();
		
		
		
		

	}

}
