package com.cydeo.spring05thymeleaf.service.impl;

import com.cydeo.spring05thymeleaf.model.Cart;
import com.cydeo.spring05thymeleaf.model.CartItem;
import com.cydeo.spring05thymeleaf.model.Product;
import com.cydeo.spring05thymeleaf.repository.ProductRepository;
import com.cydeo.spring05thymeleaf.service.CartService;
import com.cydeo.spring05thymeleaf.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

@Service
public class CartServiceImpl implements CartService {
    public static Cart CART = new Cart(BigDecimal.ZERO,new ArrayList<>());

    private final ProductService productService;
    private final ProductRepository productRepository;


    public CartServiceImpl(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;

    }

    @Override
    public Cart addToCart(UUID productId, Integer quantity) {
        //todo retrieve product from repository method

        Product product = productRepository.findProductById(productId);

        //todo initialise cart item

        CartItem cartItem = new CartItem();

        //todo set cartItem fields using given parameters

        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setTotalAmount(product.getPrice().multiply(BigDecimal.valueOf(quantity)));

        //todo add cartItem to cart, using existing getCartItemList() method

        CART.getCartItemList().add(cartItem);


        //todo calculate cart total amount

        CART.setCartTotalAmount(CART.getCartTotalAmount().add(cartItem.getTotalAmount()));


        return CART;
    }



    @Override
    public boolean deleteFromCart(UUID productId){

        CartItem itemToDelete = CART.getCartItemList().stream().filter(p->p.getProduct().getId().equals(productId))
                .findAny().orElseThrow();

        CART.setCartTotalAmount(CART.getCartTotalAmount().subtract(itemToDelete.getTotalAmount()));

        return CART.getCartItemList().remove(itemToDelete);


    }
}

