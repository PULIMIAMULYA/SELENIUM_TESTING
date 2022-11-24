package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe"); 
		ChromeDriver d= new ChromeDriver();
		d.get("https://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		d.findElement(By.name("option3")).click();
		WebElement check1= d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> check3=check1.findElements(By.tagName("input"));
		//d.findElement(By.name("option1")).click();
		System.out.println(check3.size());
		for(int i=0;i<check3.size();i++) {
			System.out.println(check3.get(i).getAttribute("checked")+" "+ check3.get(i).getAttribute("value"));
		}
		
	}

}
