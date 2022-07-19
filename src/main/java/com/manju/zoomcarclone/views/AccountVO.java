package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.AccountStatus;
import com.manju.zoomcarclone.models.AccountType;
import com.manju.zoomcarclone.models.UserDetails;

public class AccountVO {

    private String name;
    private String emailId;
    private String phone;
    private String status;
    private String accountType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return accountType;
    }

    public void setType(String type) {
        this.accountType = type;
    }
}
