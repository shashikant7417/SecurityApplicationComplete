package com.shashi.springsecurity.securityapplication.dto;

import lombok.Data;

@Data
public class LoginDto {

    private String email;
    private String password;
}
