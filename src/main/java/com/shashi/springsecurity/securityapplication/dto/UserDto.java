package com.shashi.springsecurity.securityapplication.dto;

import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
}
