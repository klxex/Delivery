package com.hwan.delivery.controller;

import com.hwan.delivery.dto.AccountRequestDto;
import com.hwan.delivery.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/accounts")
    public void saveAccount(@ModelAttribute AccountRequestDto accountRequestDto){
        log.debug("계정 저장!!!!!!!!");
        accountService.save(accountRequestDto);
    }

}
