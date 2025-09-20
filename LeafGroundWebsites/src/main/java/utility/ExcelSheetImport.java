package utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSheetImport {

    public static String getExcelImportsheet(String sheetName, int getRow, int getCell) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/data/Untitled spreadsheet.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("CountryName");
        return sheet.getRow(0).getCell(0).getStringCellValue();

    }

}
