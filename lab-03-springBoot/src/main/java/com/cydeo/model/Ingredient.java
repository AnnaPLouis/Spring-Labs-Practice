package com.cydeo.model;

import com.cydeo.enums.QuantityType;
import lombok.*;

@Getter
@Setter
public class Ingredient {

    private String name;
    private int quantity;
    private QuantityType quantityType;
}
