package com.example.fashionista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.fashionista.Entites.Clothes;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes,Long> {

    Clothes findByClothId(Long id);

    Optional<Clothes> findAllByClothType(String clothType);

    @Override
    List<Clothes> findAll();

    Clothes findByClothName(String clothName);




    
}
