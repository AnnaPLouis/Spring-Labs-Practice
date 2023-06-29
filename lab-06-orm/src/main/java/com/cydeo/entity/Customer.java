package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Customer extends BaseEntity{


    private String firstName;
    private String lastName;
    private String email;
    private String userName;

    @OneToMany(mappedBy = "customer")
    private List<Cart> cartList;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;


    @OneToMany(mappedBy = "customer")
    private List<Address> addressList;


    public Customer(String firstName, String lastName, String email, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
    }
}
