package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


@Entity
@Data
@NoArgsConstructor

public class Discount extends BaseEntity{


    private String name;
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;


    public Discount(String name, BigDecimal discount, DiscountType discountType) {
        this.name = name;
        this.discount = discount;
        this.discountType = discountType;
    }
}
