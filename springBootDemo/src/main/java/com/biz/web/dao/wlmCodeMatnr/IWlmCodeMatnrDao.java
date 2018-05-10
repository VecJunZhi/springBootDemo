package com.biz.web.dao.wlmCodeMatnr;

import com.biz.web.entity.userinfo.UserInfoEntity;
import com.biz.web.entity.wlmCodeMatnr.WlmCodeMatnrEntity;
import com.biz.web.model.userinfo.UserInfoDto;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：springBootDemo
 * @类名称：IWlmCodeMatnrDao
 * @类描述：
 * @创建人：yanzh
 * @创建时间：2018/4/25 16:05
 */
public interface IWlmCodeMatnrDao {
    public List<WlmCodeMatnrEntity> queryWlm();
    public List<WlmCodeMatnrEntity> queryMandtKunnr();
    public List<WlmCodeMatnrEntity> queryVtweg();
    public List<WlmCodeMatnrEntity> queryMatnr();
    public List<WlmCodeMatnrEntity> queryKunnr();
}
