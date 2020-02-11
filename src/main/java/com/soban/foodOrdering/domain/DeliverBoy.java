package com.soban.foodOrdering.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DeliverBoy {

    @Id
    @GeneratedValue
    private int id;

    private char startLocation;
    private char dropLocation;
    private int departTime;

}
