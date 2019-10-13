package data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    static FileInputStream fis = null;

    public FileInputStream readExcel()
    {
        String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\data\\UserData.xlsx";
        File srcFile = new File(filePath);
        try {
            fis = new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            System.out.println("Test data file not found, terminating process");
            System.exit(5);
        }
        return fis;
    }
    public Object[][] getExcelData() throws IOException {
        fis = readExcel();
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        int TotalNumberOfRows = (sheet.getLastRowNum()+1);
        int TotalNumberOfCols = 4;

        String [][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];
        for (int i = 0; i< TotalNumberOfRows; i++)
        {
            for (int j = 0; j < TotalNumberOfCols; j++) {
                XSSFRow row = sheet.getRow(i);
                arrayExcelData[i][j] = row.getCell(j).toString();
            }
        }
        wb.close();
        return arrayExcelData;
    }
}
