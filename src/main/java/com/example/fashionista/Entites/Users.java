package com.example.fashionista.Entites;

import javax.persistence.*;


import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "status")
    private boolean active;

    //research is more with the cascade type
//    @Column(name = "cloths")
//    @OneToMany(mappedBy = "users")
//    private Set<Clothes> clothes= new HashSet<>();

    @Column(name = "collection")
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "users")
    private Set<Collections> collections= new HashSet<>();

    //Nullary
    public Users(){

    }

    public Users(Long id, String email, String password, String description, String name, boolean active) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.description = description;
        this.name = name;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    

}

