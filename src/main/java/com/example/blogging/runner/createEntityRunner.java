package com.example.blogging.runner;


import com.example.blogging.autore.Autore;
import com.example.blogging.autore.AutoreRepository;
import com.example.blogging.autore.AutoreService;
import com.example.blogging.blog.Blog;
import com.example.blogging.blog.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class createEntityRunner implements CommandLineRunner {
    private AutoreService autoreService;
    private BlogService blogService;

    @Override
    public void run(String... args) throws Exception {



    }


}
