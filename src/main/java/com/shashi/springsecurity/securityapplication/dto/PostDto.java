package com.shashi.springsecurity.securityapplication.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PostDto {

    private Long id;
    private String title;
    private String description;

}
