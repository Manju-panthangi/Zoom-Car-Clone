package com.manju.zoomcarclone.views;

import com.manju.zoomcarclone.models.AccountStatus;
import com.manju.zoomcarclone.models.AccountType;
import com.manju.zoomcarclone.models.UserDetails;

public class AccountVO {

    private UserDetails userDetails;
    private AccountStatus status;
    private AccountType type;

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
