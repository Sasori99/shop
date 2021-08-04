package com.aibless.mapper;

import com.aibless.dto.review.ReviewDto;
import com.aibless.model.review.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface ReviewMapper extends EntityMapper<ReviewDto, Review> {

    @Mapping(target = "product", source = "product", qualifiedByName = "name")
    ReviewDto toDto(Review entity);
}
