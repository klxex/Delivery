package com.hwan.delivery.service;

import com.hwan.delivery.domain.Account;
import com.hwan.delivery.domain.AccountContext;
import com.hwan.delivery.dto.AccountRequestDto;
import com.hwan.delivery.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService{
    private final AccountRepository accountRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account account  = accountRepository.findByEmail(email).orElseThrow(()->{
            return new UsernameNotFoundException("username이 존재하지 않습니다" + email);
        });

        return new AccountContext(account);
    }

    public Long save(AccountRequestDto accountDto){
        accountDto.setPassword(passwordEncoder.encode(accountDto.getPassword()));
        return accountRepository.save(accountDto.toEntity()).getId();
    }
}
