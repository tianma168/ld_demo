package com.fastshow.scim2.model;

import lombok.Data;

@Data
public class UserMeta {
    private String created;
    private String location;
    private String lastModified;
    private String resourceType;
}
