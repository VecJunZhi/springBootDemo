package com.biz.web.service.userinfo;

import com.biz.web.entity.userinfo.UserInfoEntity;
import com.biz.web.model.userinfo.UserInfoDto;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：IUserService
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 17:34
 */
public interface IUserInfoService {

    public List<UserInfoEntity> queryAllUser(UserInfoDto user);

}
