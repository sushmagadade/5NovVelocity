package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericCellValue {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\PRACTICE.xlsx");
		double Data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(6).getNumericCellValue();
		System.out.println(Data);
	}

}
