package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintsSngleRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\PRACTICE.xlsx");
		Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<=Data.getLastRowNum();i++) {

			
		}
	}

}
