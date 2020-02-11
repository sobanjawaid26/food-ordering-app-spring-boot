package com.soban.foodOrdering.domain;

import javax.persistence.*;

@Entity
public class Restraunt {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    private RestrauntOwner restrauntOwner;

    private String name;
    private  String address;
    private float rating;

}
