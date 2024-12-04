package com.example.fashionista.Entites;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;



public class Collections {
    @Id
    @Column(name = "collectionId")
    private Long collectionId;
    @Column(name = "collectionName")
    private String collectionName;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "collections")
    @Column(name = "look")
    private List<Looks> lookCollection;

    private boolean publicOrPrivate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;


    public Collections(){
        
    }
    

    public Collections(Long collectionId, String collectionName, List<Looks> lookCollection, boolean publicOrPrivate) {
        this.collectionId = collectionId;
        this.collectionName = collectionName;
        this.lookCollection = lookCollection;
        this.publicOrPrivate = publicOrPrivate;
    }


    public Long getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Long collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public List<Looks> getLookCollection() {
        return lookCollection;
    }

    public void setLookCollection(List<Looks> lookCollection) {
        this.lookCollection = lookCollection;
    }

    public boolean isPublicOrPrivate() {
        return publicOrPrivate;
    }

    public void setPublicOrPrivate(boolean publicOrPrivate) {
        this.publicOrPrivate = publicOrPrivate;
    }

    
    
}
