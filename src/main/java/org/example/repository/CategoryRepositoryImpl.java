package org.example.repository;

import org.example.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CategoryRepositoryImpl implements CategoryRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Category> findAll() {
        String queryStr = "SELECT c FROM Category AS c";
        TypedQuery<Category> query = em.createQuery(queryStr, Category.class);
        return query.getResultList();
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category obj) {

    }

    @Override
    public void remove(Long id) {

    }
}
