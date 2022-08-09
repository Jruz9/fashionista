package com.example.fashionista.Entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Collections {
    @Id
    @GeneratedValue
    private Long id;
    private String collectionName;
    private List<Looks> lookCollection;
    private boolean publicOrPrivate;

    
}
