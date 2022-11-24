package keyword;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class callingkeyword {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         methods m1 = new methods();
         FileInputStream f1 = new FileInputStream("D:\\exel\\keys.xlsx") ;
         XSSFWorkbook wb = new XSSFWorkbook(f1);
         XSSFSheet ws = wb.getSheet("sheet1");
         Row  r = null;
         Cell c = null;
         Iterator<Row> row = ws.iterator();
         while(row.hasNext()) {
        	 r= row.next();
        	 c=r.getCell(2);
        	 String s1=c.getStringCellValue();
        	 if(s1.equals("Opening_Browser")) {
        		 m1.opening_browser();
        	 }
        	 else if (s1.equals("Navite")) {
        		 m1.navigate();
        	 }
        	 else if (s1.equals("User_Name")) {
        		 m1.usernameenter();
        	 }
        	 else if (s1.equals("Password")) {
        		 m1.passwordenter();
        	 }
        	 else if (s1.equals("Click")) {
        		 m1.click();
        	 }
        	 else if (s1.equals("Close")){
        		 m1.close();
        	 }
        	 
         }
         
	}

}
