package com.aibless.category.exception.common;

public abstract class CategoryServicesException extends RuntimeException{
    private final CategoryServicesError categoryServicesError;

    public CategoryServicesException(CategoryServicesError error) {
        super();
        this.categoryServicesError = error;
    }

    public CategoryServicesError getCategoryServicesError() {
        return categoryServicesError;
    }
}
