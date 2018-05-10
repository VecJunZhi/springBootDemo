package com.biz.web.service.orderinfo.impl;

import com.biz.web.dao.userinfo.IUserInfoDao;
import com.biz.web.entity.userinfo.UserInfoEntity;
import com.biz.web.model.userinfo.UserInfoDto;
import com.biz.web.service.orderinfo.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderInfoServiceImpl
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:53
 */
@Service
@Transactional
public class OrderInfoServiceImpl implements IOrderInfoService {
    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public List<UserInfoEntity> queryAllUser(UserInfoDto user) {
        return userInfoDao.queryAllUser(user);
    }
}
