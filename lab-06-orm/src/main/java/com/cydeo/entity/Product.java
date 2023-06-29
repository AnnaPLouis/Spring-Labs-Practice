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
public class Product extends BaseEntity{

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer remaining_quantity;

    @ManyToMany
    @JoinTable(name = "product_category_rel",
            joinColumns = @JoinColumn(name = "p_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> categoryList;

    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItemList;

    public Product(String name, BigDecimal price, Integer quantity, Integer remaining_quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.remaining_quantity = remaining_quantity;
    }



}
