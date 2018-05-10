package com.biz.web.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：DateUtils
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/25 10:15
 */
public class DateUtils {


    private static final String FORMAT_STRING = "yyyy-MM-dd";
    private static final String FORMAT_STRING_SS = "yyyy-MM-dd HH:mm:ss";
    private static final String FORMAT_STRING_Two = "yyyyMMdd";

    public DateUtils() {
    }

    public static String formatCurrentDate() {
        Date ss = new Date();
        SimpleDateFormat format0 = new SimpleDateFormat(FORMAT_STRING_Two);
        String time = format0.format(ss.getTime());//这个就是把时间戳经过处理得到期望格式的时间
        return  time;
    }
}
