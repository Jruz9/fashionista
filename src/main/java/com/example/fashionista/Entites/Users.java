package com.example.fashionista.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
    private String description;
}

