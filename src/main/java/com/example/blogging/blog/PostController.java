package com.example.blogging.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogPost")
@RequiredArgsConstructor
public class PostController {
    private final BlogService blogService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Blog> findAll() {
        return blogService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Blog findById(@PathVariable Long id) {
        return blogService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogResponse save(@RequestBody BlogRequest request) {
        return blogService.save(request);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BlogResponsComplete modifica(@PathVariable Long id,@RequestBody BlogRequest request){
        return blogService.modifica(id, request);
    }
}
