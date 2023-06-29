package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class CartItem extends BaseEntity {



    private Integer quantity;


    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Product product;

    public CartItem(Integer quantity) {
        this.quantity = quantity;

    }
}
