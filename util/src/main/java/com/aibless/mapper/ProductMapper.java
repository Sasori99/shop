package com.aibless.mapper;

import com.aibless.dto.category.CategoryDto;
import com.aibless.dto.product.ProductDto;
import com.aibless.model.category.Category;
import com.aibless.model.product.Product;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring", uses = { CategoryMapper.class })
public interface ProductMapper extends EntityMapper<ProductDto, Product>{

    @Mapping(target = "category", source = "category", qualifiedByName = "name")
    ProductDto toDto(Product entity);

    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    ProductDto toDtoName(Product entity);
}
