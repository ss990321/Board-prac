package com.sparta.week03.controller;


import com.sparta.week03.domain.*;
import com.sparta.week03.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController extends Timestamped {

    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/posts")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        return postRepository.save(post);
    }

    @PutMapping("/api/posts/{id}")
    public Post updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    @GetMapping("/api/posts")
    public List<PostDto> getPosts() {
        List<Post> list = postRepository.findAllByOrderByCreatedAtDesc();
        List<PostDto> PostList = new LinkedList<>();
        for (Post post : list) {
            PostList.add(new PostDto(post));
        }
        return PostList;
    }

    @GetMapping("/api/posts/{id}")
    public Post getDetailPosts(@PathVariable Long id) {
        return postRepository.findById(id).orElseThrow(() -> new NullPointerException("해당 아이디의 게시글이 존재하지 않습니다."));
    }

    @PostMapping("/api/posts/{id}")
    public boolean isPassword(@PathVariable Long id, @RequestBody PasswordDto requestDto) {
        return postService.Password(id, requestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }

}
