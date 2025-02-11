package com.example.blogging.blog;

import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;


    public Blog save(BlogRequest request){
        Blog blog=new Blog();
        BeanUtils.copyProperties(request, blog);

        return blogRepository.save(blog);
        BlogResponse response= new BlogResponse();
        BeanUtils.copyProperties(blog, response);

    }
    public List<Blog> findAll(){
        return blogRepository.findAll();
    }

    public Blog findById(Long id){
        if(!blogRepository.existsById(id)){
            throw new EntityNotFoundException("Blog non trovato");
        }
        return blogRepository.findById(id).get();
    }

}
