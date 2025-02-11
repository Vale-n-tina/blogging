package com.example.blogging.blog;

import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {
    private final BlogRepository blogRepository;


    public BlogResponse save(BlogRequest request) {
        if (blogRepository.existsByTitolo(request.getTitolo())) {
            throw new EntityExistsException("Titolo già presente");
        }
        Blog blog = new Blog();
        BeanUtils.copyProperties(request, blog);

        blogRepository.save(blog);
        BlogResponse response = new BlogResponse();

        BeanUtils.copyProperties(blog, response);
        return response;
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public Blog findById(Long id) {
        if (!blogRepository.existsById(id)) {
            throw new EntityNotFoundException("Blog non trovato");
        }
        return blogRepository.findById(id).get();
    }

    public BlogResponsComplete modifica(Long id, BlogRequest request) {
        Blog blog = findById(id);
        BeanUtils.copyProperties(request, blog);
        blogRepository.save(blog);
        BlogResponsComplete response = new BlogResponsComplete();
        BeanUtils.copyProperties(blog, response);
        return response;


    }

}
