package com.aibless.dto.review;

import com.aibless.dto.product.ProductDto;
import lombok.Data;

import java.time.Instant;
import java.util.Objects;

public class ReviewDto {
    private Long id;

    private String content;

    private Integer status;

    private Long starNumber;

    private Instant createdAt;

    private Instant updatedAt;

    private ProductDto product;

    public ReviewDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getStarNumber() {
        return starNumber;
    }

    public void setStarNumber(Long starNumber) {
        this.starNumber = starNumber;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewDto reviewDto = (ReviewDto) o;
        return Objects.equals(id, reviewDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ReviewDto{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", status=" + status +
                ", starNumber=" + starNumber +
                '}';
    }
}
