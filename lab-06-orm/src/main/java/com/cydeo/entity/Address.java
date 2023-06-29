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
public class Address extends BaseEntity{


    private String name;
    private String street;
    private String zipCode;


    @ManyToOne
    private Customer customer;


}
