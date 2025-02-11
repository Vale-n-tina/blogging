package com.example.blogging.blog;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    public boolean existsByTitolo(String titolo);
}
