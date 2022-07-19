package com.manju.zoomcarclone.dao.impl;

import com.manju.zoomcarclone.dao.AccountDAO;
import com.manju.zoomcarclone.models.Account;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private Map<String,Account> accountIdVsAccount;

    public AccountDAOImpl(){
        accountIdVsAccount = new HashMap<>();
    }

    @Override
    public void register(Account account) {
        if(account!=null) {
            accountIdVsAccount.put(account.getAccountId(), account);
        }
    }
}
