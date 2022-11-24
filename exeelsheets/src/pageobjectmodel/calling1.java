package pageobjectmodel;



	import org.openqa.selenium.chrome.ChromeDriver;

	public class calling1  {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			pom_1 c=new pom_1(d);
			c.uname();
			c.pass();
			c.submit();

		}

	}


