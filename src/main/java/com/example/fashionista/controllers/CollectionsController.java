package com.example.fashionista.controllers;

import com.example.fashionista.Entites.Collections;
import com.example.fashionista.Entites.Looks;
import com.example.fashionista.services.CollectionService;
import com.example.fashionista.services.LookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class CollectionsController {

    @Autowired
    CollectionService collectionService;

    @Autowired
    LookService lookService;


    //todo: add function to create collection
    public ResponseEntity createCollection(Collections collections){
        Collections saveCollection=collectionService.saveCollection(collections);
        return ResponseEntity.ok().build();
    }


    //todo: add function to list all collections made
    public List<Collections> collectionsList(){
        List<Collections> groupList =  collectionService.CollectionList();
        return groupList;
    }


    //todo: add function to delete collections

    public ResponseEntity deleteCollection(Long collectionId){
        Collections deletedCollection= collectionService.findCollectionById(collectionId);
        collectionService.deleteCollection(deletedCollection);

        return ResponseEntity.ok().build();
    }



    //todo: add function to add looks to a collection
    public  ResponseEntity addLookToCollection(Long collectionId, Long lookId ){
        Collections selectedCollection= collectionService.findCollectionById(collectionId);
        Looks selectedLook= lookService.findByLooksId(lookId);
        collectionService.addLooksToCollections(selectedLook,selectedCollection);

        return  ResponseEntity.ok().build();
    }


    //todo: add function to remove look from a collection
    public  ResponseEntity removeLookFromCollection(Long collectionId,Long lookId){
        Collections theCollection= collectionService.findCollectionById(collectionId);
        Looks removedLook=lookService.findByLooksId(lookId);
        collectionService.deleteLooksFromCollections(removedLook,theCollection);
        return  ResponseEntity.ok().build();
    }

    //todo: add function to find collection by collectionId

    public Collections findCollectionById(Long collectionsId){
        Collections foundCollections= collectionService.findCollectionById(collectionsId);
        return foundCollections;
    }


}
