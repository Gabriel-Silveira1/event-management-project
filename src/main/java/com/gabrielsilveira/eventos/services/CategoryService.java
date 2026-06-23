package com.gabrielsilveira.eventos.services;

import com.gabrielsilveira.eventos.entities.Category;
import com.gabrielsilveira.eventos.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
