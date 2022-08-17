package com.example.fashionista.repository;

import com.example.fashionista.Entites.Looks;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface LooksRepository extends PagingAndSortingRepository<Looks,Long> {

    Looks findByLookName(String lookName);

    Looks findByLookId(Long lookId);





}
