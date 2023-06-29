package com.cydeo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category extends BaseEntity{


     private String name;

    public Category(String name) {
        this.name = name;
    }






}
