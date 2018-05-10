package com.biz.web.service.jjnWlmCountLog.impl;

import com.biz.web.dao.jjnWlmCountLog.IJJnWlmCountLogDao;
import com.biz.web.model.jjnWlmCountLog.JJnWlmCountLogDto;
import com.biz.web.service.jjnWlmCountLog.IJJnWlmCountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：JJnWlmCountLogServiceImpl
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/26 16:09
 */
@Service
@Transactional
public class JJnWlmCountLogServiceImpl implements IJJnWlmCountLogService {
    @Autowired
    IJJnWlmCountLogDao jnWlmCountLogDao;
    @Override
    public void insertData(JJnWlmCountLogDto jJnWlmCountLogDto) {
        jnWlmCountLogDao.insertData(jJnWlmCountLogDto);
    }

    @Override
    public void insertDataBatch(List<JJnWlmCountLogDto> list) {
        jnWlmCountLogDao.insertDataBatch(list);
    }
}
