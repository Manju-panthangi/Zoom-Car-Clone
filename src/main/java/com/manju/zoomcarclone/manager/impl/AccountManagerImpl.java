package com.manju.zoomcarclone.manager.impl;

import com.manju.zoomcarclone.dao.AccountDAO;
import com.manju.zoomcarclone.manager.AccountManager;
import com.manju.zoomcarclone.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountManagerImpl implements AccountManager {
    @Autowired
    private AccountDAO accountDAO;


    @Override
    public void register(Account account) {
        accountDAO.register(account);
    }
}
