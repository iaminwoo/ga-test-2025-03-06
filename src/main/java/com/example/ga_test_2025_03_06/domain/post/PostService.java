package com.example.ga_test_2025_03_06.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void createPost(String title, String content) {
        System.out.println(title);
        System.out.println(content);
        Post newPost = new Post(title, content);
        postRepository.save(newPost);
    }
}
