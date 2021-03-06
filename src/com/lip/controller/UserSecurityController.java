package com.lip.controller;

import com.lip.pojo.result.RequestResult;
import com.lip.pojo.result.UserInfoResult;
import com.lip.service.UserSecurityServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/security")
public class UserSecurityController {

    @Autowired
    public UserSecurityServie userSecurityServie;

    @ResponseBody
    @RequestMapping("/pwdlogin")
    public UserInfoResult loginByPassword(String uid, String pwd){
        return userSecurityServie.userLogin(uid,pwd);
    }

    @ResponseBody
    @RequestMapping("/tokenlogin")
    public RequestResult loginByToken(String token){
        return userSecurityServie.tokenLogin(token);
    }


}
