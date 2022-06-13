package com.hwan.delivery.dto;


import com.hwan.delivery.domain.Account;
import com.hwan.delivery.domain.AccountContext;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class SessionUser implements Serializable {
    String username;
    String password;

    public SessionUser(AccountContext account){
        this.username = account.getUsername();
        this.password = account.getPassword();
    }

}
