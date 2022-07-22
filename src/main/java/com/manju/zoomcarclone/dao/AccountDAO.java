package com.manju.zoomcarclone.dao;

import com.manju.zoomcarclone.models.Account;

import java.util.Map;

public interface AccountDAO {
    public void register(Account account);
    public Map<String, Account> getAccountIdVsAccount();
    public Map<String, String> getUserNameVsPhone();
}
