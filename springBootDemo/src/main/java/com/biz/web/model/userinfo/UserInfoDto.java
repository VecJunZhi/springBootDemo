package com.biz.web.model.userinfo;

/**
 * @version V0.1
 * @项目名称：demo
 * @类名称：UserInfoDto
 * @类描述：
 * @创建人：justin
 * @创建时间：2018-04-24 18:03
 */
public class UserInfoDto {
    private String userName;
    private String realName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
