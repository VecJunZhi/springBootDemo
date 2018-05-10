package com.biz.web.service.wlmCodeMatnr;

import com.biz.web.entity.wlmCodeMatnr.WlmCodeMatnrEntity;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：IWlmCodeMatnrService
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/25 16:30
 */
public interface IWlmCodeMatnrService {

    public List<WlmCodeMatnrEntity> queryWlm();
    public List<WlmCodeMatnrEntity> queryMandtKunnr();
    public List<WlmCodeMatnrEntity> queryVtweg();
    public List<WlmCodeMatnrEntity> queryMatnr();
    public  void exportWlmCodeMatnrData();
    public List<WlmCodeMatnrEntity> queryKunnr();
}
