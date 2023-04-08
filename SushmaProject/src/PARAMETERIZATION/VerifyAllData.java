package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyAllData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\PRACTICE.xlsx");
		Cell CellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(4);
		CellType Info = CellInfo.getCellType();
		if (Info == CellType.STRING) {
			System.out.println(CellInfo.getStringCellValue());

		}
		else if(Info==CellType.BOOLEAN) {
			System.out.println(CellInfo.getBooleanCellValue());
		}
		else if(Info==CellType.NUMERIC) {
			System.out.println(CellInfo.getNumericCellValue());
		}	
		}
		

	}


