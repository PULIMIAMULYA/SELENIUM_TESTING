package internalfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddt1_amazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\exel\\dd1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws= wb.getSheet("sheet1");
		Row r = null;
		Cell c = null;
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.com");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.manage().window().maximize();
		WebElement a = d.findElement(By.id("searchDropdownBox"));
		List<WebElement> drop1= a.findElements(By.tagName("option"));
		System.out.println("no of elements in dropdown:" + drop1.size());
		for (int i = 0; i < drop1.size(); i++) {
			System.out.println("list of elements are:" + drop1.get(i).getText());
	
		r=ws.createRow(i);
		r.createCell(0).setCellValue(drop1.get(i).getText());
		drop1.get(i).click();
		if(!drop1.get(i).isSelected()) {
			r.createCell(1).setCellValue("fail");
			
		}
		else {
			r.createCell(1).setCellValue("pass");
		}
		
		
		}
		FileOutputStream f2 = new FileOutputStream("D:\\exel\\dd1.xlsx");
        wb.write(f2);
        f2.close();

	}

}
