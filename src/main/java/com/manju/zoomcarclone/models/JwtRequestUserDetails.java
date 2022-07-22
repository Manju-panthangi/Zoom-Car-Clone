package com.manju.zoomcarclone.models;

import java.io.Serializable;

public class JwtRequestUserDetails implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String userName;
    private String phoneNumber;

    public JwtRequestUserDetails(String userName, String phoneNumber) {
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
