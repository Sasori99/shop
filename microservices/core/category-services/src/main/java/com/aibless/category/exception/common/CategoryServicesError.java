package com.aibless.category.exception.common;

public enum CategoryServicesError {
    CATEGORY_NOT_FOUND(404, "Category not found");

    private final int errorCode;

    private final String errorMessage;

    CategoryServicesError(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
