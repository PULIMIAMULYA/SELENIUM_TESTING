package properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdatafromproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("C:\\Users\\Amulya pulimi\\eclipse-workspace\\exeelsheets\\src\\internalfiles\\p1.properties");
		Properties p1 =new Properties();
		p1.load(f);
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		//fetching url from propertylist using get property
		d.get(p1.getProperty("url"));
		System.out.println(p1.getProperty("url"));
		d.manage().window().maximize();
		//fetching username from property list
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
		System.out.println(p1.getProperty("username"));
		//fetch password from property list
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		System.out.println(p1.getProperty("password"));
		d.findElement(By.name("submit")).click();
		

	}

}
