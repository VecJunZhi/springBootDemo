package com.biz.web.controller.jjnWlmCountLog;

import ch.qos.logback.core.util.FileUtil;
import com.biz.web.model.jjnWlmCountLog.JJnWlmCountLogDto;
import com.biz.web.model.jjnWlmCountLog.ReceiveDataDto;
import com.biz.web.service.jjnWlmCountLog.IJJnWlmCountLogService;
import com.biz.web.util.JxlsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：JJnWlmCountController
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/26 16:00
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/wlmCount")
public class JJnWlmCountController {

    @Autowired
    IJJnWlmCountLogService jnWlmCountLogService;
    @RequestMapping("/receiveData")
    public void save(@RequestBody ReceiveDataDto receiveDataDto) {
        List<JJnWlmCountLogDto> list=receiveDataDto.getReceiveData();
//        jnWlmCountLogService.insertDataBatch(list);
        for (JJnWlmCountLogDto dto : list) {
            jnWlmCountLogService.insertData(dto);
        }


    }
}
