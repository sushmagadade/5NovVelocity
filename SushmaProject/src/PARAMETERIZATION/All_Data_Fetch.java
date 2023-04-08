package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_Data_Fetch {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\PRACTICE.xlsx");
		Sheet Data = WorkbookFactory.create(file).getSheet("Sheet2");
		for (int i = 0; i <= Data.getLastRowNum(); i++) {
			for (int j = 0; j <= Data.getRow(i).getLastCellNum()-1; j++) {
				Cell CT = Data.getRow(i).getCell(j);
				CellType cell = CT.getCellType();
				if (cell == CellType.STRING) {
					System.out.print(CT.getStringCellValue()+" ");

				} else if (cell == CellType.BOOLEAN) {
					System.out.print(CT.getBooleanCellValue()+" ");

				} else if (cell == CellType.NUMERIC) {
					System.out.print(CT.getNumericCellValue()+" ");
				}

			}
			
                 System.out.println();
		}
	}
}
