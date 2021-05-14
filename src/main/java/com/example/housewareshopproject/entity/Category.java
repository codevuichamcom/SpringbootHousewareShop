package com.example.housewareshopproject.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
//@Builder
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String categoryName;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusCategory status;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<SubCategory> subCategories;
}
