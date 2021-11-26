package com.camacode.learn_spring_security.config;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {
    String getAuthority();
}
