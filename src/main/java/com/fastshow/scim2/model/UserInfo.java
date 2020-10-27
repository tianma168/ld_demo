package com.fastshow.scim2.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class UserInfo {
    private String displayName;
    private ArrayList schemas;
    private String externalId;
    private String userName;
    private UserNameObject name;
    private String id;
    private UserMeta meta;
}
