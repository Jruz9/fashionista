package com.example.fashionista.Entites;    

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "looks")
public class Looks {
    @Id
    @GeneratedValue
    private Long lookId;
    private String lookName;


    @OneToMany(fetch =FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "looks")
    private Set<Clothes> looks = new HashSet<>();


    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE,optional = true)
    @JoinColumn(name = "collectionsId")
    private Collections collections;

    public  Looks(){

    }

    public Long getLookId() {
        return lookId;
    }

    public void setLookId(Long lookId) {
        this.lookId = lookId;
    }

    public String getLookName() {
        return lookName;
    }

    public void setLookName(String lookName) {
        this.lookName = lookName;
    }

    public Set<Clothes> getLooks() {
        return looks;
    }

    public void setLooks(Set<Clothes> looks) {
        this.looks = looks;
    }

    //    private Clothes hat;
//    private Clothes bottoms;
//    private Clothes shirt;
//    private Clothes handAccessory;
//    private Clothes neckAccessory;
//    private Clothes legAccessory;
//    private Clothes carry-on;
//    private Clothes jacket;
//    private Clothes socks;
    
}
