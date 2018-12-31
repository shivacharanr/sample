package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./data/testdata.xlsx");
		FileInputStream ipfile = new FileInputStream(file);

		Workbook wbook = new XSSFWorkbook(ipfile);
		Sheet sheet = wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		Row row = sheet.getRow(0);
		Row newrow=sheet.createRow(rowcount+1);
		for(int j=0;j<row.getLastCellNum();j++) {
			Cell cell = newrow.createCell(j);
			cell.setCellValue("shiva");
		}
		ipfile.close();
		FileOutputStream opfile = new FileOutputStream(file);
		wbook.write(opfile);
		opfile.close();
		



	}

}
