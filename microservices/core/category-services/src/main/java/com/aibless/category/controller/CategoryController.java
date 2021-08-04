package com.aibless.category.controller;

import com.aibless.category.service.CategoryService;
import com.aibless.dto.category.CategoryDto;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
        CategoryDto response = this.categoryService.save(categoryDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{categoryId}")
    @CachePut(value = "categories", key = "#categoryId")
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable Long id, @RequestBody CategoryDto categoryDto) {
        CategoryDto response = this.categoryService.update(id, categoryDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{categoryId}")
    @CacheEvict(value = "categories", key = "#categoryId")
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable Long id) {
        CategoryDto response = this.categoryService.deleteById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
