package DataProviderProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.*;


public class extractDataFromExcel{
	
	public ArrayList<Object[]> getDataFromExcel() throws IOException {		
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			FileInputStream ExcelFile = new FileInputStream("E:\\xlsx\\test.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(ExcelFile);

			XSSFSheet sheet = workbook.getSheet("sheet1");

			for (int RowNum=1;RowNum<=sheet.getLastRowNum();RowNum++) {
					
					XSSFCell Cell1 = sheet.getRow(RowNum).getCell(0);
					String fname = Cell1.getStringCellValue();

					XSSFCell Cell2 = sheet.getRow(RowNum).getCell(1);
					String lname = Cell2.getStringCellValue();
					
					XSSFCell Cell3 = sheet.getRow(RowNum).getCell(2);
					String email = Cell3.getStringCellValue();

					XSSFCell Cell4 = sheet.getRow(RowNum).getCell(3);
					String pwd = Cell4.getStringCellValue();
					myData.add(new Object[] {fname,lname,email,pwd});
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	
		return myData;
}
}