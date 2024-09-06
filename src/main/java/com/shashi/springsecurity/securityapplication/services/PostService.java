package com.shashi.springsecurity.securityapplication.services;

import com.shashi.springsecurity.securityapplication.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    List<PostDto> getAllPost();

    PostDto createPost(PostDto inputPost);

    PostDto getPostById(Long postId);
}
