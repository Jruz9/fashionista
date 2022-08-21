package com.example.fashionista.controllers;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.services.clothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1")
public class ClothesController {

    @Autowired
    private clothService clothService;


    // todo: function to display all clothes in repo
    @RequestMapping("/clothes")
    public List<Clothes> findAll(){
        return clothService.getAllClothes();
    }

    // todo: function to add/create clothes to repo
    @PostMapping("/clothes")
    public ResponseEntity createClothes(Clothes clothes){
        //Add exceptions
        Clothes doesClothesExist=clothService.saveClothes(clothes);
        return ResponseEntity.ok().build();

    }

    // todo: create function for get 1 cloth by id
    @GetMapping("clothes/{id}")
    public Clothes findOneCloth(@PathVariable("id") Long clothId){
        Clothes findCloth=clothService.findyByClothesId(clothId);

        return findCloth;
    }


    //todo: function to update the clothes in the repo
    @PutMapping("/clothes/{id}")
    public ResponseEntity updateClothes(Clothes clothes,@PathVariable("id") Long clothesId){
        //add exceptions later
        final Clothes clothToUpdate= clothService.findyByClothesId(clothesId);


        return ResponseEntity.ok(clothService.saveClothes(clothToUpdate));
    }

    //todo: function to delete the clothes in the repo.
    @DeleteMapping("/clothes/{id}")
    public ResponseEntity deleteCloth(@PathVariable("id") Long clothId){

        Clothes deleted_cloths= clothService.findyByClothesId(clothId);
        clothService.deleteCloth(deleted_cloths);


        return ResponseEntity.ok().build();
    }

}
