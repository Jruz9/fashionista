package com.example.fashionista.services;


import com.example.fashionista.Entites.Collections;
import com.example.fashionista.Entites.Looks;
import com.example.fashionista.repository.CollectionRepository;
import com.example.fashionista.repository.LooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    @Autowired
    LooksRepository looksRepository;

    @Autowired
    CollectionRepository collectionRepository;


    // @todo: move these functions to the entity class and call it from here.
    public void addLooksToCollections(Looks looks, Collections collections){
        collections.getLookCollection().add(looks);
    }

    public void deleteLooksFromCollections(Looks looks,Collections collections){
        collections.getLookCollection().remove(looks);
    }

    public void deleteCollection(Long collectionId){
        Collections deletedCollection= collectionRepository.findByCollectionId(collectionId);
        collectionRepository.delete(deletedCollection);
    }

    public List<Collections> CollectionList(){
        return (List<Collections>) collectionRepository.findAll();
    }

    public Collections saveCollection(Collections collections){
        return  collectionRepository.save(collections);
    }
    public String getCollectionsUsers(Collections collections){
        String collectionCreator= collections.getUsers().getName();
        return collectionCreator;
    }








}
