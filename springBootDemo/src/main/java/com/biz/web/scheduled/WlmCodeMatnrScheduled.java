package com.biz.web.scheduled;

import com.biz.web.service.wlmCodeMatnr.IWlmCodeMatnrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：WlmCodeMatnrScheduled
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/27 16:51
 */
@Component
public class WlmCodeMatnrScheduled {

    @Autowired
    IWlmCodeMatnrService wlmCodeMatnrService;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(cron = "0 25 17 * * ?")
    public void genExcelData() {
        System.out.println("begin generate excel....");
        wlmCodeMatnrService.exportWlmCodeMatnrData();
        System.out.println("end generate excel....");
    }

    /*@Scheduled(cron = "0/5 * * * * ?")
    public void reportCurrentTime() {
        System.out.println("现在d时间：" + dateFormat.format(new Date()));
    }*/


}
