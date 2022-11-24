package arrays_polym_constr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class polymorphism1 {
	WebDriver d;
	public void open_browse() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
	}
	public void open_browse(String a) {
		d.get(a);
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	}
	public void open_browse(String s1,String s2) throws InterruptedException {
		d.findElement(By.name("userName")).sendKeys(s1);
		d.findElement(By.name("password")).sendKeys(s2);
		d.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		d.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		polymorphism1 a= new polymorphism1();
		a.open_browse();
		a.open_browse("https://demo.guru99.com/test/newtours/login.php");
		a.open_browse("ammulu","123");
		
		
	}

	
	}


