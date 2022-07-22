package com.manju.zoomcarclone.controllers;

import com.manju.zoomcarclone.models.Account;
import com.manju.zoomcarclone.services.AccountService;
import com.manju.zoomcarclone.views.AccountVO;
import com.manju.zoomcarclone.views.mappers.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public void register(@RequestBody AccountVO accountVO) throws Exception{
        Account account = accountMapper.fromView(accountVO);
        accountService.register(account);
    }


}
