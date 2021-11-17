package com.camacode.learn_spring_security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //custom authentication logic
        String username = authentication.getName();
        String password = String.valueOf(authentication.getCredentials());

        if ("sofiane".equals(username) && "1234".equals(password)){
            return new UsernamePasswordAuthenticationToken(username,password, Arrays.asList());
        }else{
            throw new AuthenticationCredentialsNotFoundException("Error in authentication !");
        }
    }

    @Override
    public boolean supports(Class<?> authenticationType) {
        //type of authentication implemented here
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authenticationType);
    }
}
