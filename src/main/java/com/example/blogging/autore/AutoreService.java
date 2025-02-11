package com.example.blogging.autore;

import com.example.blogging.blog.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AutoreService {
    private final AutoreRepository autoreRepository;

    public Autore save(Autore autore){
        return autoreRepository.save(autore);
    }

}
