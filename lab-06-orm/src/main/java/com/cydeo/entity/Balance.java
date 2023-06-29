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
public class Balance extends BaseEntity{


    private BigDecimal amount;

    public Balance(BigDecimal amount) {
        this.amount = amount;

    }


    @OneToOne
    private Customer customer;


}
