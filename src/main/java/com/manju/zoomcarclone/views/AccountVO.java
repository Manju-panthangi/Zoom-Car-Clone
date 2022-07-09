package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.AccountStatus;
import com.manju.zoomcarclone.models.AccountType;
import com.manju.zoomcarclone.models.UserDetails;

public class AccountVO {

    private UserDetails userDetails;
    private String status;
    private String accountType;

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
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
