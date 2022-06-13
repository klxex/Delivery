package com.hwan.delivery.dto;

import com.hwan.delivery.domain.Account;
import com.hwan.delivery.enums.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountRequestDto {

    String email;
    String password;
    Role role;

    public Account toEntity(){
        return Account.builder()
                .email(email)
                .password(password)
                .role(role)
                .build();
    }

}
