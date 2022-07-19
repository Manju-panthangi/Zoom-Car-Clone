package com.manju.zoomcarclone.services.impl;

import com.manju.zoomcarclone.manager.AccountManager;
import com.manju.zoomcarclone.models.Account;
import com.manju.zoomcarclone.models.AccountStatus;
import com.manju.zoomcarclone.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountManager accountManager;

    @Override
    public void register(Account account) {
        String accountID = UUID.randomUUID().toString();
        account.setAccountId(accountID);
        accountManager.register(account);
    }
}
