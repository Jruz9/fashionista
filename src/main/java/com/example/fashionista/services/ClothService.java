package com.example.fashionista.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.repository.ClothesRepository;


@Service
public class ClothService {

    @Autowired
    ClothesRepository clothesRepository;

    public Clothes saveClothes(Clothes cloth){
        return clothesRepository.save(cloth);
    }

    public List<Clothes> getAllClothes(){
        return clothesRepository.findAll();
    }
    public Clothes findByClothesId(@NonNull long clothId){
        return clothesRepository.findByClothId(clothId);
    }

    public void deleteCloth(Clothes cloth){
        clothesRepository.delete(cloth);
    }
    
    
}
