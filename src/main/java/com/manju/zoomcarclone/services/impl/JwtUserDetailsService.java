package com.manju.zoomcarclone.services.impl;

import com.manju.zoomcarclone.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String,String> listOfUsersVsPhoneNumber = accountDAO.getUserNameVsPhone();
        if(listOfUsersVsPhoneNumber.containsKey(username)){
            return new User(username,listOfUsersVsPhoneNumber.get(username),new ArrayList<>());
        }
        else{
            throw new UsernameNotFoundException("User Not Found With User Name"+username);
        }
    }
}
