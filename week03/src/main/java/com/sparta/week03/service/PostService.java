package com.sparta.week03.service;

import com.sparta.week03.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Post update(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findById(id).orElseThrow(() -> new NullPointerException("해당 아이디의 게시글이 존재하지 않습니다."));
        post.update(requestDto);
        return post;
    }

    public boolean Password(Long id, PasswordDto requestDto) {
        Post pw = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 아이디의 게시글이 존재하지 않습니다."));
        return pw.getPassword().equals(requestDto.getPassword());
    }


}