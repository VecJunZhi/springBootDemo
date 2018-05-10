package com.biz.web.model.jjnWlmCountLog;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：ReceiveDataDto
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/26 17:09
 */
public class ReceiveDataDto {
    List<JJnWlmCountLogDto> receiveData;

    public List<JJnWlmCountLogDto> getReceiveData() {
        return receiveData;
    }

    public void setReceiveData(List<JJnWlmCountLogDto> receiveData) {
        this.receiveData = receiveData;
    }
}
