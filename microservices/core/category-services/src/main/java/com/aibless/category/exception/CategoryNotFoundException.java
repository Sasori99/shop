package com.aibless.category.exception;

import com.aibless.category.exception.common.CategoryServicesError;
import com.aibless.category.exception.common.CategoryServicesException;

public class CategoryNotFoundException extends CategoryServicesException {
    public CategoryNotFoundException() {
        super(CategoryServicesError.CATEGORY_NOT_FOUND);
    }
}
