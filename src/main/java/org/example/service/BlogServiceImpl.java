package org.example.service;

import org.example.model.Blog;
import org.example.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> findBlogsByCategoryId(Long id) {
        return blogRepository.findBlogsByCategoryId(id);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }
}
