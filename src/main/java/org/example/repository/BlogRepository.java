package org.example.repository;

import org.example.model.Blog;

import java.util.List;

public interface BlogRepository extends Repository<Blog> {

    List<Blog> findBlogsByCategoryId(Long id);

}
