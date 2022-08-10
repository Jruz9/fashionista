package com.example.fashionista.Entites;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String description;
    private String name;
    private boolean active;

    //research is more with the cascade type
    @OneToMany(fetch = FetchType.LAZY,cascade =  CascadeType.ALL, mappedBy = "users")
    private Set<Clothes> clothes= new HashSet<>();

    @OneToMany()
    private Set<Collections> collections= new HashSet<>();

}

