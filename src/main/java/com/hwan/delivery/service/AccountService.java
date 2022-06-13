package com.hwan.delivery.service;

import com.hwan.delivery.dto.AccountRequestDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService  extends UserDetailsService {
        public Long save(AccountRequestDto accountRequestDto);
}
