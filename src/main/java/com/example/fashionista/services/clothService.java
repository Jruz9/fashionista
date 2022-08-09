package com.example.fashionista.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.fashionista.Entites.Clothes;
import com.example.fashionista.repository.clothesRepo;


@Service
public class clothService {

    @Autowired
    clothesRepo clothesRepoitory;

    public Clothes saveClothes(Clothes cloth){
        return clothesRepoitory.save(cloth);
    }

    public List<Clothes> getAllClothes(){
        return (List<Clothes>)clothesRepoitory.findAll();
    }
    public Optional<Clothes> findyByClothesId(@NonNull long clothId){
        return clothesRepoitory.findById(clothId);
    }

    public void deleteCloth(Clothes cloth){
        clothesRepoitory.delete(cloth);
    }
    
    
}
