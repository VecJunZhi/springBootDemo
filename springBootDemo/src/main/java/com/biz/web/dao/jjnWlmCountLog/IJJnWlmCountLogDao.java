package com.biz.web.dao.jjnWlmCountLog;

import com.biz.web.model.jjnWlmCountLog.JJnWlmCountLogDto;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：IJJnWlmCountLogDao
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/26 16:02
 */
public interface IJJnWlmCountLogDao {
    void insertData(JJnWlmCountLogDto jJnWlmCountLogDto);
    void insertDataBatch(List<JJnWlmCountLogDto>list);
}
