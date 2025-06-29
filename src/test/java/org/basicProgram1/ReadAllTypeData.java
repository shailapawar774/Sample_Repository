package org.basicProgram1;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadAllTypeData {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("./src/test/resources/ExcelFiles/TestData.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s = wb.getSheet("AllTypeData");
            int totalNoOfRows = s.getLastRowNum();
            for (int i = 0; i <= totalNoOfRows; i++) {
                Row r = s.getRow(i);
                int totalNoOfCells = r.getLastCellNum();
                for (int j = 0; j < totalNoOfCells; j++) {
                    Cell c = r.getCell(j);
                    CellType ct = c.getCellType();
                    System.out.println("****************" );
                    switch (ct) {
                        case STRING:
                            String value = c.getStringCellValue();
                            System.out.print(value);
                            break;
                        case NUMERIC:
                            boolean flag = DateUtil.isCellDateFormatted(c);
                            if (flag) {
                                Date d = c.getDateCellValue();
                                System.out.print(d);
                                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                                String dt = sdf.format(d);
                                System.out.print(dt);
                            } else {
                                double d = c.getNumericCellValue();
                                System.out.print((long) d);
                            }
                            break;
                        case BOOLEAN:
                            boolean bv = c.getBooleanCellValue();
                            System.out.print(bv);
                            break;
                        case FORMULA:
                            String formulaValue = c.getCellFormula();
                            System.out.print(formulaValue);
                            break;
                        case _NONE:
                        case BLANK:
                        case ERROR:
                            System.out.println("Cell is either blank or null");
                            break;
                        default:
                            System.out.println("Invalid Cell Type");
                    }


                }
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
