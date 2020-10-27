package com.fastshow.scim2.controller;

import com.fastshow.scim2.model.UserInfo;
import com.fastshow.scim2.model.UserInfoList;
import com.fastshow.scim2.util.FileHandler;
import com.fastshow.scim2.util.UserHandler;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * @author wanghengcheg
 */
@RestController
@RequestMapping
public class HomeResourceController {

    @PostMapping("/Users")
    public UserInfo Users(@RequestBody UserInfo userInfo,@RequestHeader(name = "Authorization", required = false) String authorization) {
        //FileHandler.writeMethod("Authorization="+authorization);
        String temp = userInfo.getDisplayName() + "|" +userInfo.getExternalId()+"\n";
        FileHandler.writeMethod(temp);
        return UserHandler.getUserInfo();
    }

    @GetMapping("/Users")
    public UserInfoList UsersFiler(String filter,@RequestHeader(name = "Authorization", required = false) String authorization) {
        //FileHandler.writeMethod("Authorization="+authorization);
        FileHandler.writeMethod("filter="+filter+"\n");
        return UserHandler.getUserList();
    }

    @GetMapping("/test")
    public String test() {
        return "testttt";
    }

    @GetMapping("/LoadUser")
    public List<String> LoadUser() {
        return FileHandler.readMethod();
    }
}