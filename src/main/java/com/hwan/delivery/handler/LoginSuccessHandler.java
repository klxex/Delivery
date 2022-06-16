package com.hwan.delivery.handler;

import com.hwan.delivery.domain.Account;
import com.hwan.delivery.domain.AccountContext;
import com.hwan.delivery.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class LoginSuccessHandler implements AuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//            HttpSession session = request.getSession(true);
//            AccountContext account = (AccountContext)authentication.getPrincipal();
//            session.setAttribute("users",new SessionUser(account));
    }

    public LoginSuccessHandler(){

    }
}
