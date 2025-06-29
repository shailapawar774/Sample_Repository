package org.basicProgram1;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


import static org.basicProgram1.GenericUtility.randomNo1;

public class RandomDataWithMap {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheetAt(2);

            int totalNoOfRows = s.getLastRowNum();
            Row headerRow = s.getRow(0);
            int randomRowIndex = randomNo1(totalNoOfRows);

            Row randomRow = s.getRow(randomRowIndex);
            //Map<String, String> rowData = new LinkedHashMap<>();
            Map<String,Object> data = new LinkedHashMap<>();

            for (int i = 0; i < randomRow.getLastCellNum(); i++)
            {
                String key = headerRow.getCell(i).getStringCellValue();
                String value = getCellValueAsString(randomRow.getCell(i));

                //rowData.put(key, value);
                data.put(key,String.valueOf(value));
            }
            // Print the random row's key-value pair
            System.out.println("Random Row Index: " + randomRowIndex);
            //System.out.println("Row Data: " + rowData);
            System.out.println("Row Data: " + data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getCellValueAsString(Cell cell) {
        if (cell == null)
            return "";
        return
                switch (cell.getCellType())
                {
                    case STRING -> cell.getStringCellValue();
                    case NUMERIC ->
                            DateUtil.isCellDateFormatted(cell) ? cell.getDateCellValue().toString() : String.valueOf(cell.getNumericCellValue());
                    case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
                    case FORMULA -> cell.getCellFormula();
                    default -> "";
                };
    }


    private static int randomNo1(int totalRows) {
        Random rand = new Random();
        return rand.nextInt(totalRows) + 1; // +1 to skip header row at index 0 }
    }
}

