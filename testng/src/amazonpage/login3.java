package amazonpage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class login3 extends login2{
  @Test(priority=4)
  public void screenshot() throws IOException {
	  File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://testng.png"));
  }
@AfterTest
public void close() {
	d.close();
	
	
}
}

