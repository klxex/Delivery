package com.hwan.delivery.controller;

import com.hwan.delivery.dto.AccountRequestDto;
import com.hwan.delivery.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        accountService.save(accountRequestDto);
    }

    @GetMapping("/authentication")
    public String getAuth(){
        return "success";
    }

    @GetMapping("/admin/test")
    public void testAdmin(){
        System.out.println("관리자 출력됩니다");
    }

    @GetMapping("/board/test")
    public void testBoard(){
        System.out.println("게시판 출력됩니다");
    }
}
