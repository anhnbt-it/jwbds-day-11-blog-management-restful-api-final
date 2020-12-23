package org.example.repository;

import org.example.model.Blog;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BlogRepositoryImpl implements BlogRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Blog> findBlogsByCategoryId(Long id) {
        String queryStr = "SELECT b FROM Blog AS b WHERE category_id = :id";
        TypedQuery<Blog> query = entityManager.createQuery(queryStr, Blog.class);
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Override
    public List<Blog> findAll() {
        String queryStr = "SELECT b FROM Blog AS b";
        TypedQuery<Blog> query = entityManager.createQuery(queryStr, Blog.class);
        return query.getResultList();
    }

    @Override
    public Blog findById(Long id) {
        String queryStr = "SELECT b FROM Blog AS b WHERE id = :id";
        TypedQuery<Blog> query = entityManager.createQuery(queryStr, Blog.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(Blog obj) {

    }

    @Override
    public void remove(Long id) {

    }
}
