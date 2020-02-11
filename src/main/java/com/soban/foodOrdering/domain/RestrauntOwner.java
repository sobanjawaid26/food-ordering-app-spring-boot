package com.soban.foodOrdering.domain;

import javax.persistence.*;

@Entity
public class RestrauntOwner {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private String email;
    private int otp;

    @OneToOne(cascade = CascadeType.ALL)
    private FoodCart foodCart;
}
