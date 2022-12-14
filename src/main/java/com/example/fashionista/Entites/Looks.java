package com.example.fashionista.Entites;    
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "looks")
public class Looks {
    @Id
    @GeneratedValue
    private Long lookId;
    private String lookName;


    @OneToMany(fetch =FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "looks")
    private Set<Clothes> looks = new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY)
    private Collections collections;
//    private Clothes hat;
//    private Clothes bottoms;
//    private Clothes shirt;
//    private Clothes handAccesory;
//    private Clothes neckAccesory;
//    private Clothes legAccesory;
//    private Clothes carryon;
//    private Clothes jacket;
//    private Clothes socks;
    
}
