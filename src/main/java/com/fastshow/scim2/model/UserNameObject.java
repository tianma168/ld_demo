package com.fastshow.scim2.model;

import lombok.Data;

@Data
public class UserNameObject {
    private String familyName;
    private String formatted;
    private String givenName;
}
