package com.manju.zoomcarclone.views.mappers;

import com.manju.zoomcarclone.models.Account;
import com.manju.zoomcarclone.models.AccountStatus;
import com.manju.zoomcarclone.models.AccountType;
import com.manju.zoomcarclone.models.UserDetails;
import com.manju.zoomcarclone.views.AccountVO;
import org.springframework.stereotype.Component;


@Component
public class AccountMapper {
    public Account fromView(AccountVO accountVo){
        Account account = new Account();
        UserDetails userDetails = new UserDetails();

        if(accountVo==null){
            return null;
        }

        userDetails.setName(accountVo.getName());
        userDetails.setEmailId(accountVo.getEmailId());
        userDetails.setPhone(accountVo.getPhone());
        account.setUser(userDetails);
        account.setStatus(AccountStatus.valueOf(accountVo.getStatus()));
        account.setType(AccountType.valueOf(accountVo.getType()));
        return account;
    }

    public AccountVO toView(Account account){
        AccountVO accountVo = new AccountVO();

        if(account==null){
            return null;
        }

        accountVo.setName(account.getUser().getName());
        accountVo.setEmailId(account.getUser().getEmailId());
        accountVo.setPhone(account.getUser().getPhone());
        accountVo.setStatus(account.getType().toString());
        accountVo.setType(account.getType().toString());
        return accountVo;
    }
}
