package com.shashi.springsecurity.securityapplication.services.serviceImpl;

import com.shashi.springsecurity.securityapplication.dto.PostDto;
import com.shashi.springsecurity.securityapplication.entities.PostEntity;
import com.shashi.springsecurity.securityapplication.entities.User;
import com.shashi.springsecurity.securityapplication.exceptions.ResourceNotFoundException;
import com.shashi.springsecurity.securityapplication.repositories.PostRepository;
import com.shashi.springsecurity.securityapplication.services.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<PostDto> getAllPost() {
        return postRepository
                .findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity,PostDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDto createPost(PostDto inputPost) {
        PostEntity postEntity = modelMapper.map(inputPost,PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity),PostDto.class);
    }

    @Override
    public PostDto getPostById(Long postId) {

//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        log.info("user {}", user);
        PostEntity postEntity = postRepository
                                .findById(postId)
                                .orElseThrow(()-> new ResourceNotFoundException("Post not found with id "+postId));
       return modelMapper.map(postEntity,PostDto.class);
    }
}
