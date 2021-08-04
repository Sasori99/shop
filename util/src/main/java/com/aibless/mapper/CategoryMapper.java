package com.aibless.mapper;

import com.aibless.dto.category.CategoryDto;
import com.aibless.model.category.Category;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDto, Category>{

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CategoryDto toDtoName(Category entity);
}
