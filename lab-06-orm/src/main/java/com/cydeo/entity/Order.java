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
@Table(name = "orders")
public class Order extends BaseEntity{


    private BigDecimal paidPrice;
    private BigDecimal totalPrice;


    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Payment payment;


    public Order(BigDecimal paidPrice, BigDecimal totalPrice ) {
        this.paidPrice = paidPrice;
        this.totalPrice = totalPrice;

    }
}
