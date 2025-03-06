package com.example.ga_test_2025_03_06.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostController {
    private final PostService postService;

    record PostCreateDto(
        String title,
        String content
    ){}

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody PostCreateDto postCreateDto) {
        postService.createPost(postCreateDto.title, postCreateDto.content);

        return ResponseEntity.ok("성공");
    }
}
