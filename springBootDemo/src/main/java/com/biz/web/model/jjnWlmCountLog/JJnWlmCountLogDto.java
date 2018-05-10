package com.biz.web.model.jjnWlmCountLog;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：JJnWlmCountLogEntity
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/26 16:02
 */
public class JJnWlmCountLogDto {
        //文件名称
        private  String fileName;
        //接受日期
        private  String receiveDate;
        //excel的sheet编码
        private  String sheetIndex;
        //excel的sheet名称
        private  String sheetName;
        //接收到的数量
        private  String num;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSheetIndex() {
        return sheetIndex;
    }

    public void setSheetIndex(String sheetIndex) {
        this.sheetIndex = sheetIndex;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
