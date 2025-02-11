package com.example.blogging.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;


    public Blog save(Blog blog){
        return blogRepository.save(blog);
    }

}
