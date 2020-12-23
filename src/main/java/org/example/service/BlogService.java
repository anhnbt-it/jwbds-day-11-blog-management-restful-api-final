package org.example.service;

import org.example.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    List<Blog> findBlogsByCategoryId(Long id);

    Blog findById(Long id);
}
