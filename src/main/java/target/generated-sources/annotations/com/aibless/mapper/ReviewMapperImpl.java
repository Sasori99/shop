package com.aibless.mapper;

import com.aibless.dto.review.ReviewDto;
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
public class ReviewMapperImpl implements ReviewMapper {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Review toEntity(ReviewDto dto) {
        if ( dto == null ) {
            return null;
        }

        Review review = new Review();

        review.setCreatedAt( dto.getCreatedAt() );
        review.setUpdatedAt( dto.getUpdatedAt() );
        review.setId( dto.getId() );
        review.setContent( dto.getContent() );
        review.setStatus( dto.getStatus() );
        review.setStarNumber( dto.getStarNumber() );
        review.setProduct( productMapper.toEntity( dto.getProduct() ) );

        return review;
    }

    @Override
    public List<Review> toEntity(List<ReviewDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Review> list = new ArrayList<Review>( dtoList.size() );
        for ( ReviewDto reviewDto : dtoList ) {
            list.add( toEntity( reviewDto ) );
        }

        return list;
    }

    @Override
    public List<ReviewDto> toDto(List<Review> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReviewDto> list = new ArrayList<ReviewDto>( entityList.size() );
        for ( Review review : entityList ) {
            list.add( toDto( review ) );
        }

        return list;
    }

    @Override
    public ReviewDto toDto(Review entity) {
        if ( entity == null ) {
            return null;
        }

        ReviewDto reviewDto = new ReviewDto();

        reviewDto.setProduct( productMapper.toDtoName( entity.getProduct() ) );
        reviewDto.setId( entity.getId() );
        reviewDto.setContent( entity.getContent() );
        reviewDto.setStatus( entity.getStatus() );
        reviewDto.setStarNumber( entity.getStarNumber() );
        reviewDto.setCreatedAt( entity.getCreatedAt() );
        reviewDto.setUpdatedAt( entity.getUpdatedAt() );

        return reviewDto;
    }
}
