package com.fast.family.security.mobile;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * @author 张顺
 * @version 1.0
 * @created 2018/9/27-21:23
 */
public class SmsCodeAuthenticationToken extends AbstractAuthenticationToken{


    private final Object principal;

    public SmsCodeAuthenticationToken(Collection<? extends GrantedAuthority> authorities, Object principal) {
        super(authorities);
        this.principal = principal;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}