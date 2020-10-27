package com.fastshow.scim2.util;

import com.fastshow.scim2.model.UserInfo;
import com.fastshow.scim2.model.UserInfoList;
import com.fastshow.scim2.model.UserMeta;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class UserHandler {
    public static  UserInfoList getUserList()
    {
        ArrayList<UserInfo> arrayList = new ArrayList<>();
        ArrayList<String> schemas = new ArrayList<>();
        schemas.add("urn:ietf:params:scim:api:messages:2.0:ListResponse");
        UserInfoList userInfoList = new UserInfoList();
        userInfoList.setResources(arrayList);
        userInfoList.setItemsPerPage(20);
        userInfoList.setStartIndex(1);
        userInfoList.setSchemas(schemas);
        userInfoList.setTotalResults(0);
        return userInfoList;
    }

    public static UserInfo getUserInfo() {

        UserInfo userInfo = new UserInfo();
        userInfo.setDisplayName(UUID.randomUUID().toString());
        userInfo.setExternalId(UUID.randomUUID().toString());
        userInfo.setUserName(UUID.randomUUID().toString());
        ArrayList<String> userSchemas = new ArrayList<>();
        userSchemas.add("urn:ietf:params:scim:schemas:core:2.0:User");
        userInfo.setSchemas(userSchemas);
        userInfo.setId(UUID.randomUUID().toString());
        UserMeta userMeta = new UserMeta();
        userMeta.setCreated(new Date().toString());
        userMeta.setLastModified(new Date().toString());
        userMeta.setResourceType("User");
        userMeta.setLocation("https://www.lovelk.cn/demo-0.0.1-SNAPSHOT/scim/Users/277698276029199366");

        userInfo.setMeta(userMeta);
        return userInfo;
    }
}
