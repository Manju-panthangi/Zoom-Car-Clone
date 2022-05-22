package com.manju.zoomcarclone.views.mappers;

import com.manju.zoomcarclone.models.Account;
import com.manju.zoomcarclone.views.AccountVO;



public class AccountMapper {
    public Account fromView(AccountVO accountVo){
        Account account = new Account();

        if(accountVo==null){
            return null;
        }

        account.setUser(accountVo.getUserDetails());
        account.setStatus(accountVo.getStatus());
        account.setType(accountVo.getType());
        return account;
    }

    public AccountVO toView(Account account){
        AccountVO accountVo = new AccountVO();

        if(account==null){
            return null;
        }

        accountVo.setUserDetails(account.getUser());
        accountVo.setStatus(account.getStatus());
        accountVo.setType(account.getType());
        return accountVo;
    }
}
