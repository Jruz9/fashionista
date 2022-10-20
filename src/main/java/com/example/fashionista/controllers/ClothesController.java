package com.example.fashionista.controllers;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.services.clothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1")
public class ClothesController {

    @Autowired
    private clothService clothService;


    // function to display all clothes in repo
    @RequestMapping("/clothes")
    public List<Clothes> findAll(){
        return clothService.getAllClothes();
    }

    // function to add/create clothes to repo
    @PostMapping("/clothes")
    public ResponseEntity<String> createClothes(Clothes clothes){
        //Add exceptions
        Clothes doesClothesExist=clothService.saveClothes(clothes);
        return ResponseEntity.ok().build();

    }

    // create function for get 1 cloth by id
    @GetMapping("/clothes/{id}")
    public Clothes findOneCloth(@PathVariable("id") Long clothId){
        Clothes findCloth=clothService.findyByClothesId(clothId);

        return findCloth;
    }


    //function to update the clothes in the repo
    @PutMapping("/clothes/{id}")
    public ResponseEntity<Clothes> updateClothes(Clothes clothes,@PathVariable("id") Long clothesId){
        //add exceptions later
        final Clothes clothToUpdate= clothService.findyByClothesId(clothesId);


        return ResponseEntity.ok(clothService.saveClothes(clothToUpdate));
    }

    //function to delete the clothes in the repo.
    @DeleteMapping("/clothes/{id}")
    public ResponseEntity<String> deleteCloth(@PathVariable("id") Long clothId){

        Clothes deleted_cloths= clothService.findyByClothesId(clothId);
        clothService.deleteCloth(deleted_cloths);


        return ResponseEntity.ok().build();
    }

}
