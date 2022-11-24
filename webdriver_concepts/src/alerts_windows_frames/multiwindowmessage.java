package alerts_windows_frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindowmessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parent_id=d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("messageWindowButton")).click();
		Set<String> child_ids = d.getWindowHandles();
		System.out.println(child_ids);
		for( String handle : child_ids) {
			if(!handle.equalsIgnoreCase(parent_id)){
				d.switchTo().window(handle);
				d.manage().window().maximize();
				System.out.println(d.findElement(By.xpath("/html/body")).getText());
				d.close();
			}
			
		}
           
	}

}
