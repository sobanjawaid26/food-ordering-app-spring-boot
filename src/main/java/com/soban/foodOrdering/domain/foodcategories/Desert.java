package com.soban.foodOrdering.domain.foodcategories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Desert {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private int price;
}
