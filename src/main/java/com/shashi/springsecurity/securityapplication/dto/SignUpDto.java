package com.shashi.springsecurity.securityapplication.dto;

import com.shashi.springsecurity.securityapplication.entities.enums.Permission;
import com.shashi.springsecurity.securityapplication.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Data
public class SignUpDto {

    private String name;
    private String email;
    private String password;
    private Set<Role> roles;
    private Set<Permission> permissions;

}
