package com.example.fashionista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.repository.ClothesRepository;


@Service
public class clothService {

    @Autowired
    ClothesRepository clothesRepository;

    public Clothes saveClothes(Clothes cloth){
        return clothesRepository.save(cloth);
    }

    public List<Clothes> getAllClothes(){
        return (List<Clothes>) clothesRepository.findAll();
    }
    public Optional<Clothes> findyByClothesId(@NonNull long clothId){
        return clothesRepository.findById(clothId);
    }

    public void deleteCloth(Clothes cloth){
        clothesRepository.delete(cloth);
    }
    
    
}
