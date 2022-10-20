package com.example.fashionista.controllers;

import com.example.fashionista.Entites.Collections;
import com.example.fashionista.Entites.Looks;
import com.example.fashionista.services.CollectionService;
import com.example.fashionista.services.LookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class CollectionsController {

    @Autowired
    CollectionService collectionService;

    @Autowired
    LookService lookService;


    // function to create collection
    @PostMapping("/collections")
    public ResponseEntity<String> createCollection(Collections collections){
        Collections saveCollection=collectionService.saveCollection(collections);
        return ResponseEntity.ok().build();
    }


    // function to list all collections made
    @RequestMapping("/collections")
    public List<Collections> collectionsList(){
        List<Collections> groupList =  collectionService.CollectionList();
        return groupList;
    }


    // function to delete collections
    @DeleteMapping("/collections/{id}")
    public ResponseEntity<String> deleteCollection(@PathVariable("id") Long collectionId){
        Collections deletedCollection= collectionService.findCollectionById(collectionId);
        collectionService.deleteCollection(deletedCollection);

        return ResponseEntity.ok().build();
    }



    // function to add looks to a collection
    @PostMapping("/collections/{id}/{lookId}")
    public  ResponseEntity addLookToCollection(@PathVariable("id") Long collectionId, @PathVariable("lookId") Long lookId ){
        Collections selectedCollection= collectionService.findCollectionById(collectionId);
        Looks selectedLook= lookService.findByLooksId(lookId);
        collectionService.addLooksToCollections(selectedLook,selectedCollection);

        return  ResponseEntity.ok().build();
    }


    // function to remove look from a collection
    @DeleteMapping("collections/{id}/{lookId}")
    public  ResponseEntity removeLookFromCollection(@PathVariable("id") Long collectionId, @PathVariable("lookId") Long lookId){
        Collections theCollection= collectionService.findCollectionById(collectionId);
        Looks removedLook=lookService.findByLooksId(lookId);
        collectionService.deleteLooksFromCollections(removedLook,theCollection);
        return  ResponseEntity.ok().build();
    }

    // function to find collection by collectionId

    @GetMapping("/collections/{id}")
    public Collections findCollectionById(@PathVariable("id") Long collectionsId){
        return collectionService.findCollectionById(collectionsId);
    }


}
