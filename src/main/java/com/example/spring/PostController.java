package com.example.spring;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {

    public PostController(PostRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    private final PostRepository postsRepository;

    @GetMapping("/main")
    public List<Post> getPosts() {
        return (List<Post>) postsRepository.findAll();
    }

    @PostMapping("/main")
    void addPost(@RequestBody Post post) {
        postsRepository.save(post);
    }
}
