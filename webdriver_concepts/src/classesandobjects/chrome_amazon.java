package classesandobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_amazon {
	WebDriver d;
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
	}
	public String /*void*/ get_title() {
		return /*System.out.println(*/d.getTitle();
	}
	public String /*void*/ get_current_url() {
		return /*System.out.println(*/d.getCurrentUrl();
	}
	public void drop_down() {
		WebElement a= d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		System.out.println("no of elements in dropdown:"+ b.size());
		for(int i=0;i<b.size();i++) {
			System.out.println("list of elements are:"+ b.get(i).getText());
		}
	}
	public void screen_shot() throws IOException {
		File src =((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://amazon1.png"));
		
	}
	public void close() {
		d.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       chrome_amazon c=new chrome_amazon();
       c.open_chrome();
       String title = c.get_title();
       System.out.println(title);
       String url= c.get_current_url();
       System.out.println(url);
        c.drop_down();
        c.screen_shot();
        c.close();
	}

}
