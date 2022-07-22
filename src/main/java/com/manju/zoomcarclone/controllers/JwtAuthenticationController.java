package com.manju.zoomcarclone.controllers;


import com.manju.zoomcarclone.models.JwtRequestUserDetails;
import com.manju.zoomcarclone.models.JwtResponse;
import com.manju.zoomcarclone.services.impl.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService JwtuserDetailsService;

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequestUserDetails authenticationRequest) throws Exception {

        authenticate(authenticationRequest.getUserName(), authenticationRequest.getPhoneNumber());

        final UserDetails userDetails = JwtuserDetailsService
                .loadUserByUsername(authenticationRequest.getUserName());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String phoneNumber) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, phoneNumber));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

}
