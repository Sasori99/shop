package com.aibless.category.service.iml;

import com.aibless.category.exception.CategoryNotFoundException;
import com.aibless.category.repository.CategoryRepository;
import com.aibless.category.service.CategoryService;
import com.aibless.dto.category.CategoryDto;
import com.aibless.mapper.CategoryMapper;
import com.aibless.model.category.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceIml implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;


    public CategoryServiceIml(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        Category persisted = categoryMapper.toEntity(categoryDto);
        return categoryMapper.toDto(categoryRepository.save(persisted));
    }

    @Override
    public CategoryDto update(Long id, CategoryDto categoryDto) {
        CategoryDto persisted = findById(id);
        persisted.setName(categoryDto.getName());
        persisted.setStatus(categoryDto.getStatus());

        Category updateItem = categoryRepository.save(categoryMapper.toEntity(persisted));
        return categoryMapper.toDto(updateItem);
    }

    @Override
    public CategoryDto findById(Long id) {
        Category response = categoryRepository.findById(id).orElseThrow(CategoryNotFoundException::new);
        return categoryMapper.toDto(response);
    }

    @Override
    public CategoryDto deleteById(Long id) {
        CategoryDto persisted = findById(id);
        categoryRepository.deleteById(id);
        return persisted;
    }

    @Override
    public List<CategoryDto> getAll() {
        return categoryMapper.toDto(categoryRepository.findAll());
    }
}
