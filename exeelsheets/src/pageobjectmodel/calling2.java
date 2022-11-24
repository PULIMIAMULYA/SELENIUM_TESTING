package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/register.php";
		d.get(baseurl);
		d.manage().window().maximize();
		pom2 a2 = new pom2(d);
		a2.firstname();
		a2.lastname();
		a2.phone();
		a2.uname();
		a2.country();
		a2.submit();

	}

}
