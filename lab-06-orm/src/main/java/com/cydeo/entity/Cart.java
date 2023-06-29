package com.cydeo.entity;


import com.cydeo.enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Cart extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CartState cartState;

    public Cart(CartState cartState) {
        this.cartState = cartState;
    }


    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Customer customer;







}
