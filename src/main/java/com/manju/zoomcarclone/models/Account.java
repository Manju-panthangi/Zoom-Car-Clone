package com.manju.zoomcarclone.models;

public class Account {
    private String accountId;
    private UserDetails userDetails;
    private AccountStatus status;
    private AccountType type;


    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public UserDetails getUser() {
        return userDetails;
    }

    public void setUser(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
