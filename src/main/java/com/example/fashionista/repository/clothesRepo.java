package com.example.fashionista.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.fashionista.Entites.Clothes;

@Repository
public interface clothesRepo extends PagingAndSortingRepository<Clothes,Long> {
    
}
