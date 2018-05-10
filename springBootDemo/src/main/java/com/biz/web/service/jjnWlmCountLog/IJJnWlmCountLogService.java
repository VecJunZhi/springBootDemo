package com.biz.web.service.jjnWlmCountLog;

import com.biz.web.model.jjnWlmCountLog.JJnWlmCountLogDto;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：IJJNWlmCountLogService
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/26 16:04
 */
public interface IJJnWlmCountLogService {
    void insertData(JJnWlmCountLogDto jJnWlmCountLogDto);
    void insertDataBatch(List<JJnWlmCountLogDto> list);
}
