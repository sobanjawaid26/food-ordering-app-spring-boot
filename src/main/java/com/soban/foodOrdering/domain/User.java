package com.soban.foodOrdering.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String email;
    private String password;
    private int otp;
}
