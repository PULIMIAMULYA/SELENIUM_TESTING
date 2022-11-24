package alerts_windows_frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multi_window {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d;
		System.setProperty("webdriver.chrome.driver","C://chromeDriver.exe");
		d= new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_id = d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("windowButton")).click();
		Set<String> Child_ids=d.getWindowHandles();
		System.out.println(Child_ids);
		for(String handles:Child_ids) {
			if(!handles.equalsIgnoreCase(parent_id)) {
				d.switchTo().window(handles);
				d.manage().window().maximize();
				System.out.println(d.findElement(By.id("sampleHeading")).getText());
				d.close();
				}
			
			}
		
		d.switchTo().window(parent_id);
		Thread.sleep(2000);
		d.close();

	}

}
