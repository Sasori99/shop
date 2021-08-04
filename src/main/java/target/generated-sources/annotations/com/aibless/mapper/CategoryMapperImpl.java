package com.aibless.mapper;

import com.aibless.dto.category.CategoryDto;
import com.aibless.dto.product.ProductDto;
import com.aibless.dto.review.ReviewDto;
import com.aibless.model.category.Category;
import com.aibless.model.product.Product;
import com.aibless.model.review.Review;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-04T22:48:42+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toEntity(CategoryDto dto) {
        if ( dto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCreatedAt( dto.getCreatedAt() );
        category.setUpdatedAt( dto.getUpdatedAt() );
        category.setId( dto.getId() );
        category.setName( dto.getName() );
        category.setStatus( dto.getStatus() );
        category.setProductList( productDtoListToProductList( dto.getProductList() ) );

        return category;
    }

    @Override
    public CategoryDto toDto(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( entity.getId() );
        categoryDto.setName( entity.getName() );
        categoryDto.setStatus( entity.getStatus() );
        categoryDto.setProductList( productListToProductDtoList( entity.getProductList() ) );
        categoryDto.setCreatedAt( entity.getCreatedAt() );
        categoryDto.setUpdatedAt( entity.getUpdatedAt() );

        return categoryDto;
    }

    @Override
    public List<Category> toEntity(List<CategoryDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( dtoList.size() );
        for ( CategoryDto categoryDto : dtoList ) {
            list.add( toEntity( categoryDto ) );
        }

        return list;
    }

    @Override
    public List<CategoryDto> toDto(List<Category> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CategoryDto> list = new ArrayList<CategoryDto>( entityList.size() );
        for ( Category category : entityList ) {
            list.add( toDto( category ) );
        }

        return list;
    }

    @Override
    public CategoryDto toDtoName(Category entity) {
        if ( entity == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setId( entity.getId() );
        categoryDto.setName( entity.getName() );

        return categoryDto;
    }

    protected Review reviewDtoToReview(ReviewDto reviewDto) {
        if ( reviewDto == null ) {
            return null;
        }

        Review review = new Review();

        review.setCreatedAt( reviewDto.getCreatedAt() );
        review.setUpdatedAt( reviewDto.getUpdatedAt() );
        review.setId( reviewDto.getId() );
        review.setContent( reviewDto.getContent() );
        review.setStatus( reviewDto.getStatus() );
        review.setStarNumber( reviewDto.getStarNumber() );
        review.setProduct( productDtoToProduct( reviewDto.getProduct() ) );

        return review;
    }

    protected List<Review> reviewDtoListToReviewList(List<ReviewDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Review> list1 = new ArrayList<Review>( list.size() );
        for ( ReviewDto reviewDto : list ) {
            list1.add( reviewDtoToReview( reviewDto ) );
        }

        return list1;
    }

    protected Product productDtoToProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setCreatedAt( productDto.getCreatedAt() );
        product.setUpdatedAt( productDto.getUpdatedAt() );
        product.setId( productDto.getId() );
        product.setName( productDto.getName() );
        product.setStatus( productDto.getStatus() );
        product.setAmount( productDto.getAmount() );
        product.setPrice( productDto.getPrice() );
        product.setDescription( productDto.getDescription() );
        product.setCategory( toEntity( productDto.getCategory() ) );
        product.setReviewList( reviewDtoListToReviewList( productDto.getReviewList() ) );

        return product;
    }

    protected List<Product> productDtoListToProductList(List<ProductDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Product> list1 = new ArrayList<Product>( list.size() );
        for ( ProductDto productDto : list ) {
            list1.add( productDtoToProduct( productDto ) );
        }

        return list1;
    }

    protected ReviewDto reviewToReviewDto(Review review) {
        if ( review == null ) {
            return null;
        }

        ReviewDto reviewDto = new ReviewDto();

        reviewDto.setId( review.getId() );
        reviewDto.setContent( review.getContent() );
        reviewDto.setStatus( review.getStatus() );
        reviewDto.setStarNumber( review.getStarNumber() );
        reviewDto.setCreatedAt( review.getCreatedAt() );
        reviewDto.setUpdatedAt( review.getUpdatedAt() );
        reviewDto.setProduct( productToProductDto( review.getProduct() ) );

        return reviewDto;
    }

    protected List<ReviewDto> reviewListToReviewDtoList(List<Review> list) {
        if ( list == null ) {
            return null;
        }

        List<ReviewDto> list1 = new ArrayList<ReviewDto>( list.size() );
        for ( Review review : list ) {
            list1.add( reviewToReviewDto( review ) );
        }

        return list1;
    }

    protected ProductDto productToProductDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( product.getId() );
        productDto.setName( product.getName() );
        productDto.setStatus( product.getStatus() );
        productDto.setAmount( product.getAmount() );
        productDto.setPrice( product.getPrice() );
        productDto.setDescription( product.getDescription() );
        productDto.setCreatedAt( product.getCreatedAt() );
        productDto.setUpdatedAt( product.getUpdatedAt() );
        productDto.setCategory( toDto( product.getCategory() ) );
        productDto.setReviewList( reviewListToReviewDtoList( product.getReviewList() ) );

        return productDto;
    }

    protected List<ProductDto> productListToProductDtoList(List<Product> list) {
        if ( list == null ) {
            return null;
        }

        List<ProductDto> list1 = new ArrayList<ProductDto>( list.size() );
        for ( Product product : list ) {
            list1.add( productToProductDto( product ) );
        }

        return list1;
    }
}
