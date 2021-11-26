package com.camacode.learn_spring_security.config;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.Collection;

public interface UserDetails extends Serializable {
    String getUsername();
    String getPassword();
    Collection<? extends GrantedAuthority> getAuthorities();
    boolean isAccountNotExpired();
    boolean isAccountNotLocked();
    boolean isCredentialsNonExpired();
    boolean isEnabled();
}
