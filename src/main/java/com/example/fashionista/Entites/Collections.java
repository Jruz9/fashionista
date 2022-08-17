package com.example.fashionista.Entites;

import java.util.List;

import javax.persistence.*;

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
    private Long collectionId;
    private String collectionName;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "collections")
    private List<Looks> lookCollection;

    private boolean publicOrPrivate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    
}
