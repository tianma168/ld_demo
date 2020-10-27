package com.fastshow.scim2.model;
import lombok.Data;

import java.util.ArrayList;

@Data
public class UserInfoList {
    private ArrayList<String> schemas;
    private ArrayList<UserInfo> Resources;
    private Integer totalResults;
    private Integer startIndex;
    private Integer itemsPerPage;
}
