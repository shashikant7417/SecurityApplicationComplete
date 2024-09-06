package com.shashi.springsecurity.securityapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginResponseDto {

    Long id;
    String accessToken;
    String refreshToken;
}
