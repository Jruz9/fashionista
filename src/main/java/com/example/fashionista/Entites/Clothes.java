package com.example.fashionista.Entites;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Long clothId;
    private String name;
    private String clothType;
    private String color;
    private String pattern;
    private String material;
    private Long size;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Looks looks;


}
