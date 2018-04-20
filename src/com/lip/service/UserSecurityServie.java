package com.lip.service;

import com.lip.pojo.Userinfo;
import com.lip.pojo.result.RequestResult;

public interface UserSecurityServie {

    // 注册
    public RequestResult userRegister(Userinfo userinfo);

    // 登陆
    public RequestResult userLogin(String uid,String pwd);

    // 使用Token登陆
    public RequestResult tokenLogin(String token);

    // 后台管理系统登陆
    public String bgLogin(String username,String password);

    // 修改密码
    public RequestResult changePassword(String uid,String oldpwd,String newpwd);

    // AccessToken登陆验证
    public boolean checkAccessToken(String accesstoken);

}
