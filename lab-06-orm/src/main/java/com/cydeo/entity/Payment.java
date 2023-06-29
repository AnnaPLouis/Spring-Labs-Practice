package com.cydeo.entity;

import com.cydeo.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Payment extends BaseEntity {



    private BigDecimal paidPrice;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;



    public Payment(BigDecimal paidPrice, PaymentMethod paymentMethod) {
        this.paidPrice = paidPrice;
        this.paymentMethod = paymentMethod;
    }
}
