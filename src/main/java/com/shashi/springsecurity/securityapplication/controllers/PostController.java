package com.shashi.springsecurity.securityapplication.controllers;

import com.shashi.springsecurity.securityapplication.dto.PostDto;
import com.shashi.springsecurity.securityapplication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    @Secured("ROLE_USER")
    public List<PostDto> getAllPosts(){
        return postService.getAllPost();

    }

    @GetMapping("/{postId}")
    public PostDto getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);

    }

    @PostMapping
    public PostDto createPost(@RequestBody PostDto inputPost){
       return postService.createPost(inputPost);

    }
}
