package com.example.fashionista.controllers;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.Entites.Looks;
import com.example.fashionista.services.LookService;
import com.example.fashionista.services.clothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class LooksController {

    @Autowired
    LookService lookService;

    @Autowired
    clothService clothService;


    //  create show looks list
    @PostMapping("/looks")
    public List<Looks> getAllLooks(){
        List<Looks> looksList=lookService.getAllLooks();
        return looksList;
    }

    // create add/create look list
    @RequestMapping("/looks")
    public ResponseEntity<String> createLook(Looks looks){
        Looks saveLook= lookService.saveLook(looks);
        return ResponseEntity.ok().build();
    }


    //create find look by id function
    @GetMapping("/looks/{id}")
    public Looks findOneLook(@PathVariable("id") Long lookId){
        Looks findOneLook=lookService.findByLooksId(lookId);

        return findOneLook;
    }


    //create update look list Information function

    @PutMapping("/looks/{id}")
    public ResponseEntity<String> UpdateLookListInformation(@PathVariable("id") Long lookId){
        Looks lookGroup= lookService.findByLooksId(lookId);

        lookService.saveLook(lookGroup);

        return ResponseEntity.ok().build();

    }

    //create function to add clothes to looks list

    @PostMapping("/looks/{id}/{clothId}")
    public ResponseEntity<String> addClothesToLook(@PathVariable("id") Long lookId, @PathVariable("clothId") Long clothId){
        Looks LooksGroup=lookService.findByLooksId(lookId);
        Clothes clothesInLook=clothService.findyByClothesId(clothId);
        lookService.addClothesToLooks(clothesInLook, LooksGroup);

        return ResponseEntity.ok().build();

    }


    //create function to delete/remove clothes from looks list
    @DeleteMapping("/looks/{id}/{lookId}")
    public ResponseEntity<String> removeClothFromLook( @PathVariable("id") Long lookId, @PathVariable("lookId") Long clothId){
        Looks looks = lookService.findByLooksId(lookId);
        Clothes clothes= clothService.findyByClothesId(clothId);

        lookService.removeClothFromLooks(clothes,looks);

        return ResponseEntity.ok().build();

    }

    // Delete looks
    @DeleteMapping("/looks/{id}")
    public ResponseEntity<String> deleteLook(@PathVariable("id") Long lookId){
        Looks deletedLook= lookService.findByLooksId(lookId);
        lookService.deleteLook(deletedLook.getLookId());

        return ResponseEntity.ok().build();
    }

}
