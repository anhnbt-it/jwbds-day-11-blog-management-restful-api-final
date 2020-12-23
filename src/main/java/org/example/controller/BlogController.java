package org.example.controller;

import org.example.model.Blog;
import org.example.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogs() {
        List<Blog> blogs = blogService.findAll();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable("id") Long id) {
        Blog blog = blogService.findById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }
}
