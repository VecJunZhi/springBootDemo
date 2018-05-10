package com.biz.web.controller.orderinfo;

import com.alibaba.fastjson.JSONArray;
import com.biz.web.entity.userinfo.UserInfoEntity;
import com.biz.web.model.userinfo.UserInfoDto;
import com.biz.web.service.orderinfo.IOrderInfoService;
import com.biz.web.service.userinfo.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version V0.1
 * @项目名称：新增连锁渠道
 * @类名称：OrderInfoController
 * @类描述：
 * @创建人：zhaohz
 * @创建时间：2018-04-25 17:48
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/orderInfo")
public class OrderInfoController {

    @Autowired
    private IOrderInfoService orderInfoService;

    @RequestMapping("/createOrder")
    public String queryAllUser() {
        UserInfoDto user=new UserInfoDto();
        List<UserInfoEntity> userList=orderInfoService.queryAllUser(user);
        String string=JSONArray.toJSONString(userList);
        return string;
    }
}
