package practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		File fis = new File("./data/testdata.xlsx");
		@SuppressWarnings("resource")
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheetAt(0);
		int rwcnt = sheet.getLastRowNum();
		int colcnt = sheet.getRow(0).getLastCellNum();
		System.out.println(rwcnt+", "+colcnt);

		int count = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println(count);
		for(int i=0;i<=rwcnt;i++) {
			for(int j=0;j<colcnt;j++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				if (j==2) {
					System.out.println("*********************");
				}
			}
		}
		Row row = sheet.getRow(0);
		Row newrow = sheet.createRow(rwcnt+1);
		for(int j=0;j<row.getLastCellNum();j++) {
			
		}

	}

}
