package com.example.fashionista.repository;

import com.example.fashionista.Entites.Looks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface LooksRepository extends JpaRepository<Looks,Long> {

    @Override
    List<Looks> findAll();

    Looks findByLookName(String lookName);

    Looks findByLookId(Long lookId);





}
