package readingandwriting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class wriedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D:\\exel\\e1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		r=ws.createRow(2);
		r.createCell(1).setCellValue("manualtesting");
		r=ws.createRow(3);
		r.createCell(2).setCellValue("qtp");
		r=ws.createRow(4);
		r.createCell(3).setCellValue("selenium");
		FileOutputStream f1= new FileOutputStream("D:\\exel\\e1.xlsx");
		wb.write(f1);
		f1.close();
	}

}
