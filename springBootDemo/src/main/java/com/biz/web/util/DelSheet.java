package com.biz.web.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：DelSheet
 * @类描述：如果使用jxls进行多sheet，需要将模板文件删除，则需要使用该工具类
 * @创建人：yanzh
 * @创建时间：2018/5/3 9:39
 */
public class DelSheet {
    /**
     * 删除指定的Sheet
     * @param targetFile  目标文件
     * @param sheetName   Sheet名称
     */
    public static void deleteSheet(String targetFile,String sheetName) {
        try {
            FileInputStream fis = new FileInputStream(targetFile);
            HSSFWorkbook wb = new HSSFWorkbook(fis);
            fileWrite(targetFile, wb);
            //删除Sheet
            wb.removeSheetAt(wb.getSheetIndex(sheetName));
            fileWrite(targetFile, wb);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 写隐藏/删除后的Excel文件
     * @param targetFile  目标文件
     * @param wb          Excel对象
     * @throws Exception
     */
    public static void fileWrite(String targetFile,HSSFWorkbook wb) throws Exception{
        FileOutputStream fileOut = new FileOutputStream(targetFile);
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }

}
