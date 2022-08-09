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
@Table(name = "looks")
public class Looks {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private Clothes hat;
    private Clothes bottoms;
    private Clothes shirt;
    private Clothes handAccesory;
    private Clothes neckAccesory;
    private Clothes legAccesory;
    private Clothes carryon;
    private Clothes jacket;
    private Clothes socks;
    
}
