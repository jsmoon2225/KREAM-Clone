package com.kream.kream.mappers;

import com.kream.kream.dtos.ProductDTO;
import com.kream.kream.dtos.ShopProductDTO;
import com.kream.kream.dtos.SimilarProductImageDTO;
import com.kream.kream.entities.ProductEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    int insertProduct(ProductEntity product);

    ProductEntity[] selectProduct();

    ProductEntity selectProductById(Integer id);

    ProductEntity[] selectProductBySearch(@Param("filter") String filter,
                                          @Param("keyword") String keyword);

    int updateProduct(@Param("product") ProductEntity product);

    SimilarProductImageDTO[] selectProductImagesByBaseName(@Param("baseName") String baseName);

    List<ProductDTO> selectNewProducts();

    List<ProductDTO> selectPopularProducts();

    List<ShopProductDTO> selectNewProductsByFilter(@Param("filter") String filter,
                                                   @Param("keyword") String keyword,
                                                   @Param("brand") String brand,
                                                   @Param("category") String[] category,
                                                   @Param("gender") String[] gender,
                                                   @Param("color") String[] color,
                                                   @Param("price") String[] price);
}
