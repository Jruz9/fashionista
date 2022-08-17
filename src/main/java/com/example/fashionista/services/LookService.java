package com.example.fashionista.services;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.Entites.Looks;
import com.example.fashionista.repository.CollectionRepository;
import com.example.fashionista.repository.LooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class LookService {

    @Autowired
    LooksRepository looksRepository;

    @Autowired
    CollectionRepository collectionRepository;

    @Autowired
    LookService lookService;


    public Looks saveLook(Looks looks){
        return looksRepository.save(looks);
    }

    public void addClothToLooks(Clothes clothes, Looks looks){
        looks.getLooks().add(clothes);
    }

    public void deleteClothFromLooks(Clothes clothes, Looks looks){
        looks.getLooks().add(clothes);
    }

    //change back to looks object if there are errors
    public void deleteLook(Long looksId){
        Looks looks = looksRepository.findByLookId(looksId);
         looksRepository.delete(looks);
    }

    public List<Looks> getAllLooks(){

        return looksRepository.findAll();
    }

    public Looks findByLooksId(Long lookId){
        return looksRepository.findByLookId(lookId);
    }

}
