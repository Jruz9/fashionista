package com.example.fashionista.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cloths")
public class Clothes {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String clothType;
    private String color;
    private String pattern;
    private String material;
    private Long size;

}
