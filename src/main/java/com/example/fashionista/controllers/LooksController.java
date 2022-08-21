package com.example.fashionista.controllers;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.Entites.Looks;
import com.example.fashionista.services.LookService;
import com.example.fashionista.services.clothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping
public class LooksController {

    @Autowired
    LookService lookService;

    @Autowired
    clothService clothService;


    // todo: create show looks list
    @RequestMapping("/looks")
    public List<Looks> getAllLooks(){
        List<Looks> looksList=lookService.getAllLooks();
        return looksList;
    }

    // todo: create add/create look list

    //todo: create find look by id function
    public Looks findOneLook(Long lookId){
        Looks findOneLook=lookService.findByLooksId(lookId);

        return findOneLook;
    }


    //todo: create update look list Information function

    public ResponseEntity UpdateLookListInformation(Long lookId){
        Looks lookGroup= lookService.findByLooksId(lookId);

        lookService.saveLook(lookGroup);

        return ResponseEntity.ok().build();

    }

    //todo: create function to add clothes to looks list

    public ResponseEntity addClothesToLook(Long lookId, Long clothId){
        Looks LooksGroup=lookService.findByLooksId(lookId);
        Clothes clothesInLook=clothService.findyByClothesId(clothId);
        lookService.addClothesToLooks(clothesInLook, LooksGroup);

        return ResponseEntity.ok().build();

    }


    //todo: create function to delete/remove clothes from looks list

    public ResponseEntity removeClothFromLook(Long lookId, Long clothId){
        Looks looks = lookService.findByLooksId(lookId);
        Clothes clothes= clothService.findyByClothesId(clothId);

        lookService.removeClothFromLooks(clothes,looks);

        return ResponseEntity.ok().build();

    }

    // todo: Delete looks

    public ResponseEntity deleteLook(Long lookId){
        Looks deletedLook= lookService.findByLooksId(lookId);
        lookService.deleteLook(deletedLook.getLookId());

        return ResponseEntity.ok().build();
    }

}
