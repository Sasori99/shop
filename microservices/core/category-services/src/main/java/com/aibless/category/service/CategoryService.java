package com.aibless.category.service;

import com.aibless.dto.category.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDto);

    CategoryDto update(Long id, CategoryDto categoryDto);

    CategoryDto findById(Long id);

    CategoryDto deleteById(Long id);

    List<CategoryDto> getAll();


}
