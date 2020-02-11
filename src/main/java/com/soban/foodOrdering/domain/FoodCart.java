package com.soban.foodOrdering.domain;

import com.soban.foodOrdering.domain.foodcategories.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class FoodCart {

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private List<MainCourse> mainCourseList;

    @ManyToMany
    private List<Bread> breadList;

    @ManyToMany
    private List<RiceItem> riceItems;

    @ManyToMany
    private List<Desert> desertList;

    @ManyToMany
    private List<Snack> snackList;
}
