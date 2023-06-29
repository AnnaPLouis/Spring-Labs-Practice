package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.dto.ProductRequest;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    List<ProductDTO> getProducts();

    ProductDTO updateProduct(ProductDTO productDTO);


    ProductDTO createProduct(ProductDTO productDTO);


    List<ProductDTO> retrieveAllProductByCategoryAndPrice(List<Long> categoryList, BigDecimal price);

    ProductDTO retrieveByName(String name);

    List<ProductDTO> retrieveTop3Products();

    Integer countProductsByPrice(BigDecimal price);

    List<ProductDTO> retrieveProductByPriceAndQuantity(BigDecimal price, Integer quantity);

    List<ProductDTO> retrieveByCategory(Long categoryId);
}
