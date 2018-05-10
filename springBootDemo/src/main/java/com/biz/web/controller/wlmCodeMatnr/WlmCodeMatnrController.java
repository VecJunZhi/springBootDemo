package com.biz.web.controller.wlmCodeMatnr;

import com.biz.web.service.wlmCodeMatnr.IWlmCodeMatnrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：WlmCodeMatnrController
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/25 16:53
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/wlmCodeMatnr")
public class WlmCodeMatnrController {
    @Autowired
    IWlmCodeMatnrService wlmCodeMatnrService;

    @RequestMapping("/genExcelData")
    public void genExcelData() {
       wlmCodeMatnrService.exportWlmCodeMatnrData();
    }



}
