package com.aibless.mapper;

import com.aibless.dto.product.ProductDto;
import com.aibless.dto.review.ReviewDto;
import com.aibless.model.product.Product;
import com.aibless.model.review.Review;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-04T22:48:42+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 14.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Product toEntity(ProductDto dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setCreatedAt( dto.getCreatedAt() );
        product.setUpdatedAt( dto.getUpdatedAt() );
        product.setId( dto.getId() );
        product.setName( dto.getName() );
        product.setStatus( dto.getStatus() );
        product.setAmount( dto.getAmount() );
        product.setPrice( dto.getPrice() );
        product.setDescription( dto.getDescription() );
        product.setCategory( categoryMapper.toEntity( dto.getCategory() ) );
        product.setReviewList( reviewDtoListToReviewList( dto.getReviewList() ) );

        return product;
    }

    @Override
    public List<Product> toEntity(List<ProductDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( dtoList.size() );
        for ( ProductDto productDto : dtoList ) {
            list.add( toEntity( productDto ) );
        }

        return list;
    }

    @Override
    public List<ProductDto> toDto(List<Product> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( entityList.size() );
        for ( Product product : entityList ) {
            list.add( toDto( product ) );
        }

        return list;
    }

    @Override
    public ProductDto toDto(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setCategory( categoryMapper.toDtoName( entity.getCategory() ) );
        productDto.setId( entity.getId() );
        productDto.setName( entity.getName() );
        productDto.setStatus( entity.getStatus() );
        productDto.setAmount( entity.getAmount() );
        productDto.setPrice( entity.getPrice() );
        productDto.setDescription( entity.getDescription() );
        productDto.setCreatedAt( entity.getCreatedAt() );
        productDto.setUpdatedAt( entity.getUpdatedAt() );
        productDto.setReviewList( reviewListToReviewDtoList( entity.getReviewList() ) );

        return productDto;
    }

    @Override
    public ProductDto toDtoName(Product entity) {
        if ( entity == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( entity.getId() );
        productDto.setName( entity.getName() );

        return productDto;
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
        review.setProduct( toEntity( reviewDto.getProduct() ) );

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
        reviewDto.setProduct( toDto( review.getProduct() ) );

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
}
