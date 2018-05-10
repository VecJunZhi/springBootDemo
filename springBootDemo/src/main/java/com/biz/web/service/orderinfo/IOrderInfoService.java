package com.biz.web.service.orderinfo;

import com.biz.web.entity.userinfo.UserInfoEntity;
import com.biz.web.model.userinfo.UserInfoDto;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：IOrderInfoService
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:53
 */
public interface IOrderInfoService {

    public List<UserInfoEntity> queryAllUser(UserInfoDto user);

}
