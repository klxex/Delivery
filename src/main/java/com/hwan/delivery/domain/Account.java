package com.hwan.delivery.domain;

import com.hwan.delivery.enums.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;

   private String email;
   private String password;
   private Role role;

    @Builder
    public Account(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
