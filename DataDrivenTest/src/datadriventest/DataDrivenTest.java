/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadriventest;

import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author bijayakhatiwada
 */
public class DataDrivenTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        // File to be read
        FileInputStream file=new FileInputStream("/Users/bijayakhatiwada/Desktop/Book1.xlsx");
        
        //Create an object workbook to access sheet and its cells
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        
        XSSFSheet sheet=workbook.getSheet("sheet1"); // provide a sheetname within a workbook
        
        int rowCount=sheet.getLastRowNum(); // This will give the last row number
        int colCount=sheet.getRow(0).getLastCellNum();
        
        for(int i=0;i<rowCount;i++){
          XSSFRow currentrow= sheet.getRow(i); // Choose the particular row
          
            for(int j=0;j<colCount;j++){
                String value= currentrow.getCell(j).toString(); // Read each cell value and store into the variable
                System.out.print(value);
                 System.out.print("   ");
                 System.out.print("   ");
                 System.out.print("   ");
            }

            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("   ");
        }
        
        
        
    
    }
    
}
