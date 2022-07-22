package com.manju.zoomcarclone.services;

import com.manju.zoomcarclone.models.Account;

public interface AccountService {
    public void register(Account account) throws Exception;
    public Boolean validate(Account account);
}
